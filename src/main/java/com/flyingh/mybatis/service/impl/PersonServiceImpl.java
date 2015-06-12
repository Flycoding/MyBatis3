package com.flyingh.mybatis.service.impl;

import com.flyingh.mybatis.mapper.PersonMapper;
import com.flyingh.mybatis.service.PersonService;
import com.flyingh.mybatis.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void add(Person person) {
        personMapper.insert(person);
    }

    @Override
    public void update(Person person) {
        personMapper.update(person);
    }

    @Override
    public void delete(int id) {
        personMapper.delete(id);
    }

    @Override
    public Person find(int id) {
        return personMapper.selectOne(id);
    }

    @Override
    public List<Person> findAll() {
        return personMapper.selectList();
    }
}
