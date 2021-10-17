package co.yedam.member;

public class SpecialUser extends User {
	private int point;

	public SpecialUser(String userID, String userPW, String userName, Grade userGrade, int age) {
		super(userID, userPW, userName, userGrade, age);
	}

	public SpecialUser(String userID, String userPW, String userName, Grade userGrade, int age, int point) {
		super(userID, userPW, userName, userGrade, age);
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("User [userID: %s, userPW: %s, userName: %s, userGrade: %s, userAge: %d, userPoint: %d]\n", super.getUserID(), super.getUserPW(), super.getUserName(), super.getUserGrade(), super.getUserAge(), this.point);
	}
}
