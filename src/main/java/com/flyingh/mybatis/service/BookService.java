package com.flyingh.mybatis.service;

import com.flyingh.mybatis.vo.Book;

import java.util.List;

public interface BookService {
    void add(Book book);

    void update(Book book);

    void delete(int id);

    Book find(int id);

    List<Book> findAll();
}
