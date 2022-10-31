package lv1_11;

class Solution {
	public long[] solution1(int x, int n) {
		long[] answer = new long[n];
		long p = 0;
		
		for(int i=0; i<answer.length; i++) {
			p += x;
			answer[i] = p;
		}
		return answer;
	}

}
