package test;

import java.util.ArrayList;
import java.util.List;

public class TestPractice9 {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer> final_grades = new ArrayList<Integer>();
		
		for (int i = 0; i < grades.size(); i++) {
			
			if (grades.get(i) < 38 || grades.get(i)%5 < 3) {
				final_grades.add(i, grades.get(i));
			}else {
				final_grades.add(i, grades.get(i)+(5-grades.get(i)%5));
			}
		}
		return final_grades;
		
	    }
	
}
