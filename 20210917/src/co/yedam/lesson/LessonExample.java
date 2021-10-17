package co.yedam.lesson;

/*
 * ����Ŭ���� + ���̺귯����Ŭ���� ������ => ���α׷� ����.
 * ��ü����(�л�, ������, ��) => ��ü������
 * �л�(��ü) -> �л�(Ŭ����)
 * ��ҿ� -> new �л�(): �ν��Ͻ�.
 */

public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("ȫ�浿", "����");

		Student s1 = new Student("��ҿ�", "010-1111-2222", "�뱸�߱�");
		Student s2 = new Student("������", "010-3333-4444", "�뱸����");

		// ������ - �л�1, �л�2, �л�3....
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г�1��");
		l1.addStudent(s1);
		l1.addStudent(s2);

		Teacher t2 = l1.getTeacher(); // Teacher
		System.out.println("�������̸�: " + t2.getName());
		System.out.println("�����԰���: " + l1.getTeacher().getMajor());
		
		l1.showStudents();
	}
}