package lv1_7;

class Solution {

	boolean solution1(String s) {
		boolean answer = true;
		
		String str = s.toUpperCase();
		char[] strArr = str.toCharArray();
		int cntP = 0;
		int cntY = 0;
		
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i] == 'P') {
				cntP++;
			} else if(strArr[i] == 'Y') {
				cntY++;
			}
		}
		
		if(cntP == cntY) { // if(cntP == cntY||(cntP==0&&cntY==0)) {
			answer = true;
		} else {
			answer = false;
		}
		
		return answer;
		
	} // solution1
	
	// cnt변수 하나로 해결하기
	boolean solution2(String s) {
		
		s = s.toLowerCase();
		int cnt = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == 'p')
				cnt++;
			else if(s.charAt(i) == 'y')
				cnt--;
				
		} // for
		
		return cnt == 0 ? true : false;
		
	} // solution2
	
}
