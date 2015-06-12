package com.flyingh.mybatis.mapper;

import com.flyingh.mybatis.vo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {
    @Insert("insert into book(name,price,p_id) values(#{name},#{price},#{person.id})")
    void insert(Book book);

    @Update("update book set name=#{name},price=#{price},p_id=#{person.id} where id=#{id}")
    void updte(Book book);

    @Delete("delete from book where id=#{id}")
    void delete(@Param("id") int id);

    Book selectOne(int id);

    List<Book> selectList();
}
