package co.yedam.member;

enum Grade {
	SPECIAL, SUPER, MID, GUEST;
}

public class User {
	// ������� ���̵�, ��й�ȣ, �̸�, ���, ����
	private String userID;
	private String userPW;
	private String userName;
	private Grade userGrade;
	private int userAge;
	
	//������.
	public User() {}
	public User(String userID, String userPW) {
		this.userID = userID;
		this.userPW = userPW;
	}
	public User(String userID, String userPW, String userName, Grade userGrade, int age) {
		this(userID, userPW);
		this.userName = userName;
		this.userGrade = userGrade;
		this.userAge = userAge;
	}
	
	//get set �޼ҵ�
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Grade getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(Grade userGrade) {
		this.userGrade = userGrade;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userPW=" + userPW + ", userName=" + userName + ", userGrade=" + userGrade
				+ ", userAge=" + userAge + "]";
	}
	
	public void showInfo() {
		System.out.printf("User [userID: %s, userPW: %s, userName: %s, userGrade: %s, userAge: %d]\n", userID, userPW, userName, userGrade, userAge);
	}
}
