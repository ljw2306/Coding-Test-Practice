package test1;

import java.util.List;

public class TestPractice3 {
	
//	arr�� �ִ� 2���� �迭���� ���� �밢���� ���� ���� ���ϰ� ���� �밢���� �տ��� ���� �밢���� ���� �� ���밪�� ���Ͻÿ�

	public static int diagonalDifference(List<List<Integer>> arr) {
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			a += arr.get(i).get(i);
		}
		
		for (int i = 0; i < arr.size(); i++) {
			b += arr.get(i).get(arr.size()-(i+1));
		}
		
		int result = a-b;
		
		return Math.abs(result);
	}
}
