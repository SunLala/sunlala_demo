package com.sun.demo_springboot.pojo;

/**
 * @author Vela Sun
 * @Date 10/12/2019 9:48 AM
 */

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person {

    private Integer id;
    private String userName;
    private String zone;
    private String email;
    private String sex;
    private String phone;
    private String createTime;

}
