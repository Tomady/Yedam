package firstProject;

public class BooleanExample {
	public static void main(String[] args) {
		boolean isOk = true;
		boolean isTeenager = false;
		
//		isOk = false;
		isOk = 20 > 10;
		
		if(isOk) {
			isTeenager = true;			
		}
		
		if(isTeenager) {
			System.out.println("청소년입니다.");
		}
		
		System.out.println("end of program");
		
	}
}
