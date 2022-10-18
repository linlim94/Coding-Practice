package lv1_4;

class Solution {
	

	
	public int solution1(int n) {
		int answer = 0;

		String[] arr = String.valueOf(n).split("");
		
		for(int i = 0; i<arr.length; i++) {
			
			answer += Integer.parseInt(arr[i]);
			
		}
			
		return answer;
		
	} // solution1
	
	public int solution2(int n) {
		int answer = 0;
		
		while(n != 0) {
			
			answer += n%10;
			n /= 10;
			
		}
		
		return answer;
		
	} // solution2
	
	public int solution3(int n) {
		int answer = 0;
		
		int length = (int)Math.log10(n)+1;
		
		for(int i = 0; i<length; i++) {
			
			answer += n%10;
			n /= 10;
			
		}
		
		return answer;
		
	} // solution3

}
