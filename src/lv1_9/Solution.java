package lv1_9;

class Solution {

	public boolean solution1(int x) {
		boolean flag = false;
		int d = 0;
		String s = String.valueOf(x);
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			d += arr[i] - '0';
		}
		
		if(x%d == 0) 
			flag = true;
		
		return flag;
	}
	
	public boolean solution2(int x) {
		int sum = String.valueOf(x).chars().map(c -> c - '0').sum();
		return x % sum == 0;
	}
}
