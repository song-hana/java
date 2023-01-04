package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String catName, int age) {
		super(catName);  // 자식클래스 생성자의 첫번째 명령어(자동생성)
		// this.animalName = catName;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
