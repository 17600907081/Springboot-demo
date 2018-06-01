package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController 
@RequestMapping("/hello") 
public class MvcController {
  
    @RequestMapping("/getUser")
    public Object getUser() {
    	User user = new User();
    	user.setId(1);
    	user.setAge(18);
    	user.setName("张三");
    	
    	return user;
	}
    @GetMapping("/getUser1")
    public Object getUser1() {
    	User user = new User();
    	user.setId(1);
    	user.setAge(18);
    	user.setName("张三1");
    	
    	return user;
    }
    
    @PostMapping("/getUser2")
    public Object getUser2() {
    	User user = new User();
    	user.setId(1);
    	user.setAge(18);
    	user.setName("张三2");
    	
    	return user;
    }
    
    public static void main(String[] args) {
    	int i = 0;
    	int intArray [] = new int[]{20,21,22,23,24,25};
    	for (int j = 0; j < intArray.length; j++) {
    		if (j==i) {
    			System.err.println(intArray[j]);
    			try {
					Thread.sleep(3000);
					i++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
    
    
}