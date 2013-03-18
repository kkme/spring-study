package com.tz.spring.service;

import com.tz.spring.entity.Book;

public class BookServiceImpl implements BookService {

	@Override
	public Book save(Book book) {
        System.out.println("保存了 book..");
		return book;
	}

}
