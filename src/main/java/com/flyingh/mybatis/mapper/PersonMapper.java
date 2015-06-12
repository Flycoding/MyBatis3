package com.flyingh.mybatis.mapper;

import com.flyingh.mybatis.vo.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PersonMapper {
    @Insert("insert into person(name,age) values(#{name},#{age})")
    void insert(Person person);

    @Update("update person set name=#{name},age=#{age} where id=#{id}")
    void update(Person person);

    @Delete("delete from person where id=#{id}")
    void delete(@Param("id") int id);

    @Select("select * from person where id=#{id}")
    Person selectOne(@Param("id") int id);

    @Select("select * from person")
    List<Person> selectList();
}
