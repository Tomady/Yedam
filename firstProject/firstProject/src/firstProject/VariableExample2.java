package firstProject;

public class VariableExample2 {
	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		int age = 25;
		String name = "정도영";
		boolean isOk = true;
		
//		isOk = age >= 25;
		
		if(age >= 25) {
			System.out.println(name + "은 " + "25세 이상");
		}

//		isOk = age <= 25;
		
		if(age <= 25) {
			System.out.println(name + "은 " + "25세 이하");
		}
		
		System.out.println("end of program.");
	}
}
