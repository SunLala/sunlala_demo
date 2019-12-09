package com.sun.demo_springboot;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication						 //springboot的启动注解
@MapperScan(basePackages = "com.sun.demo_springboot.dao")    //扫描到文件夹下的@Mapper注解
@Slf4j										 //日志打印注解
@RestController
public class DemoSpringbootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoSpringbootApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringbootApplication.class, args);
		log.info("该服务的名称是：{}",context.getEnvironment().getProperty("spring.application.name"));
		log.info("该服务的启动端口是：{}",context.getEnvironment().getProperty("server.port"));


	}

//	@Autowired
//	private PersonService service;

//	@GetMapping(value="findAll")
//	public String findAll(){
//		//
//		System.out.println("恭喜你跨越成功了");
//		return "恭喜你跨越成功了";
//
////		log.info("查询所有角色信息");
////		return service.findAll();
//	}

}
