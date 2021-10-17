package firstProject;

public class DoubleExample {

	public static void main(String[] args) {
		float f1 = 3.2F;
		double d1 = 0;
		double d2 = 0;
		double r1 = d1 + d2;
		System.out.println(Double.MAX_VALUE);
		
		d1 = d2 = 2.3;
		
		boolean isSame = d1 == d2;
		System.out.println();
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		isSame = s1.equals(s2);
		System.out.println(isSame);
	}

}
