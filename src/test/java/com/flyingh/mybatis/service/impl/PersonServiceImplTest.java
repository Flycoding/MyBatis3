package com.flyingh.mybatis.service.impl;

import com.flyingh.mybatis.service.PersonService;
import com.flyingh.mybatis.vo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app-context.xml")
public class PersonServiceImplTest {
    @Autowired
    private PersonService personService;

    @Test
    public void testAdd() throws Exception {
        personService.add(new Person("flyingh", 22));
    }

    @Test
    public void testUpdate() throws Exception {
        Person person = personService.find(1);
        person.setName("icoding");
        personService.update(person);
    }

    @Test
    public void testDelete() throws Exception {
        personService.delete(2);
    }

    @Test
    public void testFind() throws Exception {
        System.out.println(personService.find(1));
    }

    @Test
    public void testFindAll() throws Exception {
        List<Person> persons = personService.findAll();
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    @Test
    public void testFindPersonWithBooks() throws Exception {
        personService.findPersonWithBooks(1).forEach(System.out::println);
    }
}