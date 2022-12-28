package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	/*
	private String userName;
	private int age;
	LocalDate date = LocalDate.now();
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	*/
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
