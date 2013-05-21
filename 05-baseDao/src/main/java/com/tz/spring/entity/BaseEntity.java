package com.tz.spring.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Base Entity
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private String id;// ID
    private Date createDate;// 创建日期
    private Date modifyDate;// 修改日期
    private Integer version; //版本锁

    @Id
    @Column(length = 36, nullable = true)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="org.hibernate.id.UUIDGenerator")  //生成器名称，uuid生成类
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(updatable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Version
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
