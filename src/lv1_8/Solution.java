package lv1_8;

class Solution {

	public int solution1(String s) {
		/*
		int answer = 0;
		
		char check = s.charAt(0);
		
		if(check == '+') {
			s = s.substring(1);
			answer = Integer.parseInt(s);
		} else if(check == '-') {
			s = s.substring(1);
			answer = Integer.parseInt(s);
			answer *= -1;
		} else {
			answer = Integer.parseInt(s);
		}
		
		return answer;
		*/
		return Integer.parseInt(s);
	} // solution1
	
	public int solution2(String s) {
		int answer = 0;
		boolean flag = true;
		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '-') {
				flag = false;
			} else if(ch != '+') {
				// answer = answer * 10 + (ch - 48);
				answer = answer * 10 + (ch - '0');
				// System.out.println(answer);
			}
		}
		
		return flag ? answer : -1*answer; 

	} // solution2
}
