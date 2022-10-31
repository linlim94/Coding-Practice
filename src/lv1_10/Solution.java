package lv1_10;

import java.util.stream.IntStream;

class Solution {
	
	public int solution1(int n) {
		int answer = 0;
		
		for(int i=1; i<n; i++) {
			if(n%i==1) {
				answer = i;
				break;
			}
		}
		return answer;
	} // solution1
	
	public int solution2(int n) {
		return IntStream.range(2, n).filter( i -> n%i == 1).findFirst().orElse(0);
	}

}
