package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		/*
		Flower flower1 = new Flower();
		flower1.petal = 7;
		flower1.sepal = 2;
		
		Flower flower2 = new Flower();
		flower2.petal = 4;
		flower2.sepal = 1;
		
		System.out.printf("창포꽃은 꽃잎 길이가 %dcm, 꽃받침의 길이가 %dcm 입니다.\n", flower1.petal, flower1.sepal);
		System.out.printf("코스모스는 꽃잎 길이가 %dcm, 꽃받침의 길이가 %dcm 입니다.\n", flower2.petal, flower2.sepal);
		*/
		
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.flowerName = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLength = 2;
		
		flower2.flowerName = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;
	}
}

/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침의 길이가 2cm 입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.
*/