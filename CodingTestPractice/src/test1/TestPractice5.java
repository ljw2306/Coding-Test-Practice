package test;

public class TestPractice5 {
	
//	1������ n�� ���� �� �ٸ��� �ϳ��� �����ϵ��� #�� �����ÿ�.

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
