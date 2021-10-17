package Person;

import java.util.Scanner;

public class ScanUtil {
	static Scanner sc = new Scanner(System.in);

	public static int readInt(String msg) {
		System.out.println(msg);
		
		int result = 0;
		
		while(true) {
			String val = sc.nextLine();
			
			try {
				result = Integer.parseInt(val);
				break;
			}catch(Exception e) {
				System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ��Է��ϼ���");
			}
		}
		
		return result;
	}

	public static String readStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
}
