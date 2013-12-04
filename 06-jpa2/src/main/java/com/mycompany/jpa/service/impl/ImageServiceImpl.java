package com.mycompany.jpa.service.impl;

import com.mycompany.jpa.dao.ImageDao;
import com.mycompany.jpa.service.ImageService;
import com.mycompany.jpa.entity.Image;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ImageServiceImpl extends BaseServiceImpl<Image, String> implements ImageService{

    @Resource
	public void setBaseDao(ImageDao imageDao) {
		super.setBaseDao(imageDao);
	}

}
