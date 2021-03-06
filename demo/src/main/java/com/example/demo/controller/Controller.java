package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Logic;
import com.example.demo.Entity.TestClass;
import com.example.demo.Entity.TestData;

@RestController
public class Controller {
	
	TestData test=new TestData();
	
	@PostMapping("/bfhl")
	public TestClass allUser(@RequestBody TestData test){
	
		TestClass allUser =new TestClass();
		Logic l=new Logic();
		
		l.setD(test.getData());
		l.setLogic();
		allUser.setNumbers(l.getNum());
		allUser.setAlphabets(l.getAlphabets());
		allUser.setIs_success(true);
		return allUser;
	}

}
