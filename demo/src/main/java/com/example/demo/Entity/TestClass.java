package com.example.demo.Entity;

import java.util.Arrays;

public class TestClass {
	private boolean is_success;
 private String UserID="Suyash_Shankar_Patil_01/10/1995";
 private String EmailID="suyap18@gmail.com";
 private String RollNumber="PD0259";
 private int numbers[];
 private char alphabets[];
 
 
public boolean isIs_success() {
	return is_success;
}
public void setIs_success(boolean is_success) {
	this.is_success = is_success;
}
public String getUserID() {
	return UserID;
}
public void setUserID(String userID) {
	UserID = userID;
}
public String getEmailID() {
	return EmailID;
}
public void setEmailID(String emailID) {
	EmailID = emailID;
}
public String getRollNumber() {
	return RollNumber;
}
public void setRollNumber(String rollNumber) {
	RollNumber = rollNumber;
}
public int[] getNumbers() {
	return numbers;
}
public void setNumbers(int[] numbers) {
	this.numbers = numbers;
}
public char[] getAlphabets() {
	return alphabets;
}
public void setAlphabets(char[] alphabets) {
	this.alphabets = alphabets;
}
public TestClass(boolean is_success, String userID, String emailID, String rollNumber, int[] numbers,
		char[] alphabets) {
	super();
	this.is_success = is_success;
	UserID = userID;
	EmailID = emailID;
	RollNumber = rollNumber;
	this.numbers = numbers;
	this.alphabets = alphabets;
}
public TestClass() {
	super();
}
 

 
}
