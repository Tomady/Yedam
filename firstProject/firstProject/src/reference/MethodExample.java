package reference;

public class MethodExample {
	public static void main(String[] args) {
//		비만도 계산공식.
//		bmi = 몸무게 / (키*키);
//		bmi < 18.5 저체중.
//		18.5 ~ 23 정상.
//		23 ~ 25 과체중.
//		25 ~ 30 비만.
//		30 ~ 고도비만.
		
		double weight = 72.5, height = 1.75;
		
		check_BMI(weight, height);	//메소드 실행.
		check_BMI(65.8, 1.73);
		
	}
	
	//메소드를 정의할 때, 매개변수.
	public static void check_BMI(double weight, double height) {
		double bmi = 0;
		
		bmi = weight / (height*height);
		
		if(bmi < 18.5) {
			System.out.println("저체중.");
		}else if(bmi <= 23) {
			System.out.println("정상.");
		}else if(bmi <= 25) {
			System.out.println("과체중.");
		}else if(bmi <= 30) {
			System.out.println("비만.");
		}else {
			System.out.println("고도비만. 의사와 상담하세요.");
		}
	}
}
