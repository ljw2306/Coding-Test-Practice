package test;

public class TestPractice7 {
	
//	n���� ��ī�� ���Ϳ� n���� �ʰ� ���� �ִµ�, ��ī�� �� �� ���� �� ��(���� ū ��)�� �� �� �ִ�. �� �� �ִ� ���� ������ ��ȯ�ϴ� �ڵ带 �ۼ��Ͻÿ�.
	
	static int birthdayCakeCandles(int[] ar) {
		
		int max = 0;
		int count = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			if (max == ar[i]) {
				count += 1;
			}
		}
		
		System.out.println(count);
		return count;
    }
}
