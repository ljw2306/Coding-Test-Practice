package test;

public class TestPractice7 {
	
//	n살인 조카의 케익에 n개의 초가 꽂혀 있는데, 조카는 그 중 가장 긴 초(가장 큰 수)만 끌 수 있다. 끌 수 있는 초의 갯수를 반환하는 코드를 작성하시오.
	
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
