package test1;

import java.util.ArrayList;
import java.util.List;

public class TestPractice1 {
	
//	List a와 List b의 값을 비교하여 a의 값이 크면 별개의 List c의 0번 인덱스에 +1, b의 값이 크면 1번 인덱스에 +1을 하여 반환하시오. 
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> c = new ArrayList<Integer>();
		c.add(0, 0);
		c.add(1, 0);
		
		for (int i = 0; i < 3; i++) {
			if (a.get(i) > b.get(i)) {
				c.set(0, c.get(0)+1);
			} else if (a.get(i) < b.get(i)) {
				c.set(1, c.get(1)+1);
			} else {

			}
		}
		
		return c;
	}
}
