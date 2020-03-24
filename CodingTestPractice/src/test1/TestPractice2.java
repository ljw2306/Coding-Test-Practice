package test1;

public class TestPractice2 {
	
//	매우 큰 수의 합을 구하는 메소드. 배열 ar의 모든 값을 더하시오.
	
	static long aVeryBigSum(long[] ar) {
		long a = 0;
		for (int i = 0; i < ar.length; i++) {
			a += ar[i];
		}
		return a;
    }
	
}
