package com.example.demo.Entity;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

public class TestData {

	private String data[];

	@Autowired
	public TestData() {
		super();
	}

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public TestData(String[] data) {
		super();
		this.data = data;
	}

	
	

	
}
