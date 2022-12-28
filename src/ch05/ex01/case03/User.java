package ch05.ex01.case03;

public class User {
	private String userName;  //encapsulation
	private int age;
	
	public void setUserName(String userName) {  // setter
		this.userName = userName;
	}  // transparency
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserName() {  // getter
		return this.userName;
	}
	
	public int getAge() {
		return this.age;
	}  // accessor
	
	
}
