package test;

public class TestPractice5 {
	
//	1개부터 n개 까지 매 줄마다 하나씩 증가하도록 #을 찍으시오.

	static void staircase(int n) {
		
		for (int i = 1; i < n+1; i++) {
			for (int j = n; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}

}
