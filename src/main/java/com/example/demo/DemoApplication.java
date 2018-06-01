package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")	//mapper包的扫描注解 
public class DemoApplication {

	public static void main(String[] args) {
		/*
		 * 1.启动Springboot程序，启动Spring容器，启动内嵌的Tomcat
		 * 2.这个启动器必须放在控制层和其他层的同级或者以上的时候才能扫其他类和包
		 */
		SpringApplication.run(DemoApplication.class, args);
	}
}
