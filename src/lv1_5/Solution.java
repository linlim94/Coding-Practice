package lv1_5;

class Solution {
	
	public long solution1(long n) {
		long answer = 0;
		
		for(long i = 0; i<=n; i++) {
			if(i*i == n) {
				answer = (i+1)*(i+1);
				break;
			} else {
				answer = -1;
			}
		}
		
		return answer;
		
	} // solution1
	
	public long solution2(long n) {

		if(Math.pow((int)Math.sqrt(n), 2) == n) {
			return (long)Math.pow(Math.sqrt(n)+1, 2);
		} else {
			return -1; 
		}
		
	} // solution2
	
}
