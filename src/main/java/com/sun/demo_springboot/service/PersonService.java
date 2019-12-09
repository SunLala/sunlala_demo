package com.sun.demo_springboot.service;

import com.sun.demo_springboot.pojo.Person;

import java.util.List;

/**
 * @author Vela Sun
 * @Date 10/12/2019 10:51 AM
 */
public interface PersonService {
    /**
     * 查询所有用户
     * @return
     */
    List<Person> findAll();
}
