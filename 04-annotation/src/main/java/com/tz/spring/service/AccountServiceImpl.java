package com.tz.spring.service;

import com.tz.spring.dao.AccountDao;
import com.tz.spring.entity.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Calendar;

@Service//当前类作为业务逻辑层的 Bean
@Transactional(propagation = Propagation.REQUIRED
                ,isolation = Isolation.READ_COMMITTED)//类中所有方法都事务化
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public String transfer(long from, long to, double amount) {
        //转出账户是否存在
        Account fromAccount = accountDao.getById(from);
        if(fromAccount == null){
            return "账户:"+from+"不存在!";
        }
        //转入账户是否存在
        Account toAccount = accountDao.getById(to);
        if(toAccount == null){
            return "账户:"+to+"不存在!";
        }
        //转出账户的余额是否大于转账金额
        if(fromAccount.getBalance() < amount){
            return "账户余额不足!";
        }else{
            //真正做转账业务
            doTransfer(fromAccount,toAccount,amount);
            return "操作成功!";
        }
    }

    private void doTransfer(Account fromAccount ,Account toAccount ,double amount){
        //减去费用
        double minus = amount;
        //判断是否是同行转账，减去手续费(0.5%)
        if(!fromAccount.getBank().equals(toAccount.getBank())){
            minus = amount*1.05;
        }
        //对转出账户进行减操作
        fromAccount.setBalance(fromAccount.getBalance()-minus);
        //将金额加入到转入账户
        toAccount.setBalance(toAccount.getBalance()+amount);

        //更新
        accountDao.update(toAccount);
        randomException();
        accountDao.update(fromAccount);
    }

    private void randomException() {
        Calendar c = Calendar.getInstance();
        int second = c.get(Calendar.SECOND);
        if(second > 30){
            throw new RuntimeException("自定义随机异常!");
        }
    }

}
