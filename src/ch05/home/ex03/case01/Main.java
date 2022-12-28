package ch05.home.ex03.case01;

public class Main {
	public static void main(String[] args) {
		/*
		Cat myCat = new Cat();
		
		myCat.setColor("black");
		myCat.setCatName("야코미");
		
		// 나 혼자 한거
		String color = "";
		if(myCat.getColor() == "black") color = "검은";
		else if (myCat.getColor() == "white") color = "흰";
		System.out.printf("%s 고양이 한 마리를 주웠습니다.\n%s라고 이름을 지었습니다.",
				color, myCat.getCatName());
		*/
		Cat cat = new Cat();
		
		cat.setColor("black");
		cat.setCatName("야코미");
	}
}

/*
검은 고양이 한 마리를 주웠습니다.
야코미라고 이름을 지었습니다.
*/