package control;

public class JeongDoyoung {
	public static void main(String[] args) {
		//if for(while) break, continue
		for(int i=1; i<10; i++) {
			
			if(i%2==0) {
				continue;
			}
			
			for(int k=2; k<10; k++) {
				System.out.printf("%dx%d=%2d\t", k, i, k*i);
			}
			System.out.println();
		}
	}
}
