package test;

public class TestPractice6 {
	
//	int �ڷ����� 5�� ���� ��� �迭���� 4���� ���� �ּڰ��� �ִ밪�� ���ϴ� �ڵ带 �ۼ��Ͻÿ�. ��, �� ���� 2�� 32������ �ѱ� ���� ����.

	static void miniMaxSum(int[] arr) {
		
		long min = arr[0];
		long max = arr[0];
		long result1 = 0;
		long result2 = 0;
		long total = 0;

		for (int i = 0; i < arr.length; i++) {

			total += arr[i];

			if (max < arr[i]) {
				max = arr[i];
			}

			if (min > arr[i]) {
				min = arr[i];
			}

		}

		result1 = total - max;
		result2 = total - min;

		System.out.print(result1);
		System.out.print(" "+result2);

	}

}
