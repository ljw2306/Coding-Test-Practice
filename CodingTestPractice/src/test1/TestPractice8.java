package test;

public class TestPractice8 {
	
//	12시간과 AM/PM으로 표시되는 시간(12:34:56PM 등)을 24시간 표기로 바꾸는 코드를 작성하시오.

	static String timeConversion(String s) {

		String[] str = s.split(":");
		int hh = Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int ss = Integer.parseInt(str[2].substring(0, 2));

		if (str[2].contains("PM") && hh != 12) {
			hh += 12;
		}
		
		if (str[2].contains("AM") && hh == 12) {
			hh = 0;
		}
//		String conv = hh+":"+mm+":"+ss;
		
		String result = String.format("%02d:%02d:%02d", hh, mm, ss); 

		return result;
	}
}
