package ch06.home.ex03.case03;

public class User extends Object {
	/*
	private String userName;
	private int age;
	
	public User() {}
	
	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}
	
	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.getUserName() + " " + getAge() + "살";
	}
	*/
	
	private String userName;
	private int age;
	
	public User() {}
	
	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d살", userName, age);
	}
}
