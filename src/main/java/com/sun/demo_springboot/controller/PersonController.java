package com.sun.demo_springboot.controller;

import com.sun.demo_springboot.pojo.Person;
import com.sun.demo_springboot.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



/**
 * @author Vela Sun
 * @Date 10/12/2019 10:56 AM
 */
@RestController

@Slf4j
public class PersonController {
    @Autowired
    private PersonService service;

    /**
     *
     * 注释的两行是处理跨域的另一种方式，但是这里没起作用
     */
    //@CrossOrigin(origins = "http://localhost:8388")
    //@RequestMapping(method = RequestMethod.GET,value = "findAll")

    @GetMapping(value="findAll")
    public List<Person> findAll(){
        log.info("查询所有角色信息");
        return service.findAll();
    }
}
