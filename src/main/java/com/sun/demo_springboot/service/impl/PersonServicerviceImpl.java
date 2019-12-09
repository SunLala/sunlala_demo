package com.sun.demo_springboot.service.impl;

import com.sun.demo_springboot.dao.PersonMapper;
import com.sun.demo_springboot.pojo.Person;
import com.sun.demo_springboot.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vela Sun
 * @Date 10/12/2019 10:53 AM
 */
@Slf4j
@Service
public class PersonServicerviceImpl implements PersonService {

    @Autowired
    private PersonMapper mapper;

    @Override
    public List<Person> findAll() {
        return mapper.findAll();
    }
}
