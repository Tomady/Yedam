package co.yedam;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3 };
		String[] strAry = { "Hello", "World" };
		int num = 10;

		Student s1 = new Student(); // name, score
		s1.name = "홍길동";
		s1.score = 80;

		Student s2 = new Student();
		s2.name = "김민수";
		s2.score = 90;

		System.out.println("s1학생이름: " + s1.name);
		System.out.println("s1학생점수: " + s1.score);

		System.out.println("s2학생이름: " + s1.name);
		System.out.println("s2학생점수: " + s2.score);

		Student s3 = new Student();
		s3.name = "최지우";
		s3.score = 85;

		Student[] students = { s1, s2, s3 };
		System.out.println("배열 첫 번째 이름: " + students[0].name);
		System.out.println("배열 첫 번째 점수: " + students[0].score);

		System.out.println("배열 세 번째 이름: " + students[2].name);
		System.out.println("배열 세 번째 점수: " + students[2].score);

		s1.name = "박길동";
		s1.score = 70;

		for (int i = 0; i < students.length; i++) {
			System.out.println("학생이름: " + students[i].name);
			System.out.println("학생점수: " + students[i].score);
		}

	}
}
