package com.mycompany.jpa.dao.impl;

import com.mycompany.jpa.dao.ImageDao;
import com.mycompany.jpa.entity.Image;
import org.springframework.stereotype.Repository;


@Repository
public class ImageDaoImpl extends BaseDaoImpl<Image,String> implements ImageDao{

}

