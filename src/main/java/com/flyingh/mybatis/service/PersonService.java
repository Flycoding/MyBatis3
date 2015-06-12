package com.flyingh.mybatis.service;

import com.flyingh.mybatis.vo.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);

    void update(Person person);

    void delete(int id);

    Person find(int id);

    List<Person> findAll();
}
