package test1;

import java.util.List;

public class TestPractice3 {
	
//	arr에 있는 2차원 배열에서 양쪽 대각선의 합을 각각 구하고 좌향 대각선의 합에서 우향 대각선의 값을 뺀 절대값을 구하시오

	public static int diagonalDifference(List<List<Integer>> arr) {
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			a += arr.get(i).get(i);
		}
		
		for (int i = 0; i < arr.size(); i++) {
			b += arr.get(i).get(arr.size()-(i+1));
		}
		
		int result = Math.abs(a-b);
		
		return result;
	}
}
