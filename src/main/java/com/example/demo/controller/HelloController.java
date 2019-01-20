package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.config.ConfigInfos;

@Controller 
@RequestMapping("/hello")  
public class HelloController {
	@Autowired
	ConfigInfos configinfos;
	
    @RequestMapping("/sts")
    @ResponseBody
    public String helloworld(){

        System.out.println("23432");

        System.out.println("2343245dfgffh");
        return "使用spring-tool-suite插件--Helloworld *** SpringBoot！！ " 
    +"-------------" + configinfos.getName() + "**来自**" + configinfos.getLocation();


    } 
    
}