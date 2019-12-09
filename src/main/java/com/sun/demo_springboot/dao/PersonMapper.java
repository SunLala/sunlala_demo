package com.sun.demo_springboot.dao;

import com.sun.demo_springboot.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 个人信息mapper此处的Mapper 注解会被启动类的@MapperScan扫描到
 */
@Mapper
public interface PersonMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<Person> findAll();

}
