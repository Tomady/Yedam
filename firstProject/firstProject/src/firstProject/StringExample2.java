package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "정도영";
		int age = 25;
		
		// 이름은 정도영, 나이는 25
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.printf("이름은 %s, 나이는 %d", name, age);
		System.out.println();
		
		//b1(byte) == 100;
		//b2(byte) == 10;
		//result = b1, b2의 합
		
		
		byte b1 = -90;
		byte b2 = 10;
		int result = 0;
		
		result = b1 + b2;
		System.out.println(result);
		
		//90 + 10 = 100(콘솔 출력);
		//isLarger
		//result > 0
		boolean isLarger = true; //boolean true = 1 / false = 0;
		isLarger = b1 > b2; //= false;
		
		if(isLarger) {
			System.out.println("큼");
		} else {
			System.out.println("작음");
		}
		
		
		// 2,200,000,000, 120, 16
		// avg에 담아서 120을 16으로 나눈 결과:
		long num1 = 2200000000L;
		int num2 = 78;
		int num3 = 8;
		double avg;
		
		avg = (double)num2 / (double)num3;
		System.out.println(avg);
		avg = (long)num1 / (long)num2;
		System.out.println(avg);
	}
}
