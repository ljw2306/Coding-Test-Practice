package test;

import java.math.BigDecimal;

public class TestPractice4 {
	
	
//	int�� �迭�� �޾� ����, ���, 0�� �����ϰ� �� ������ �Ҽ��� 6�ڸ����� ����Ͻÿ�.
	
	static void plusMinus(int[] arr) {
		
		float positive = 0;
		float negative = 0;
		float zero = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (number > 0) {
				positive += 1;
			}else if (number < 0) {
				negative += 1;
			}else{
				zero += 1;
			}
		}
			BigDecimal result1 = new BigDecimal(((positive/arr.length)*100)/100);
			BigDecimal result2 = new BigDecimal(((negative/arr.length)*100)/100);
			BigDecimal result3 = new BigDecimal(((zero/arr.length)*100)/100);
			
			String final_result1 = String.format("%.6f", result1);
			String final_result2 = String.format("%.6f", result2);
			String final_result3 = String.format("%.6f", result3);
			
			System.out.println(final_result1);
			System.out.println(final_result2);
			System.out.println(final_result3);
			
    }
	
}
