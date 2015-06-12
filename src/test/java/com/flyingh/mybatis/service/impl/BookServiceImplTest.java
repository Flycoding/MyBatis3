package com.flyingh.mybatis.service.impl;

import com.flyingh.mybatis.service.BookService;
import com.flyingh.mybatis.service.PersonService;
import com.flyingh.mybatis.vo.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app-context.xml")
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;
    @Autowired
    private PersonService personService;

    @Test
    public void testAdd() throws Exception {
        Book book = new Book();
        book.setName("Spring");
        book.setPrice(99.9);
        book.setPerson(personService.find(1));
        bookService.add(book);
    }

    @Test
    public void testUpdate() throws Exception {
        Book book = bookService.find(1);
        book.setPerson(personService.find(3));
        book.setPrice(199);
        bookService.update(book);
    }

    @Test
    public void testDelete() throws Exception {
        bookService.delete(3);
    }

    @Test
    public void testFind() throws Exception {
        Book book = bookService.find(1);
        System.out.println(book);
    }

    @Test
    public void testFindAll() throws Exception {
        bookService.findAll().forEach(System.out::println);
    }
}