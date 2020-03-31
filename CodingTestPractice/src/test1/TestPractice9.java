package test;

import java.util.ArrayList;
import java.util.List;

public class TestPractice9 {
	
	//학생의 성적을 다시 매기는데 
	//조건1 : 원래 점수에서 다음 5의 배수의 차가 2보다 작으면 다음 5의 배수가 점수가 된다.
	//조건2 : 원래 점수에서 다음 5의 배수의 차가 2보다 크면 점수의 변화가 없다.
	//조건3 : 38점 미만은 성적 올림에 해당사항이 없다.
	//위 조건들을 만족시키는 gradingStudents 메소드를 완성하시오.
	
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
