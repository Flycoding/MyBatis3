package com.flyingh.mybatis.service.impl;

import com.flyingh.mybatis.mapper.BookMapper;
import com.flyingh.mybatis.service.BookService;
import com.flyingh.mybatis.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void add(Book book) {
        bookMapper.insert(book);
    }

    @Override
    public void update(Book book) {
        bookMapper.updte(book);
    }

    @Override
    public void delete(int id) {
        bookMapper.delete(id);
    }

    @Override
    public Book find(int id) {
        return bookMapper.selectOne(id);
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.selectList();
    }
}
