package com.example.demo.repository;

import com.example.demo.domin.student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ZhangZhen on 2017/7/28.
 */
@Mapper
public interface studentMapper {
    @Select("SELECT * FROM test.student where id = 1;")
    student findById(@Param("id")int id);
    @Insert("INSERT INTO student(id,name) VALUES(#{id},#{name})")
    int insert(@Param("id")int id,@Param("name")String name);
}
