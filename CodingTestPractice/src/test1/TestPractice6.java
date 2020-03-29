package test;

public class TestPractice6 {
	
//	int 자료형의 5개 수가 담긴 배열에서 4개의 합의 최솟값과 최대값을 구하는 코드를 작성하시오. 단, 그 합이 2의 32제곱을 넘길 수도 있음.

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
