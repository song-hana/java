package ch06.ex05.case02;

public class Animal {
	public int age;
	
	public Animal(int age) {
		this.age = age;
	}
	
	public void shout() {
		System.out.println("으르릉");
	}
	
	public int getAge() {
		return this.age;
	}
}
