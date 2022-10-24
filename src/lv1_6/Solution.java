package lv1_6;

class Solution {
	public int[] solution1(long n) {	
		
		String[] arr = String.valueOf(n).split("");
		int[] answer = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
            answer[i] = Integer.parseInt(arr[(arr.length-i)-1]);
            System.out.print(answer[i] + " ");
		}
		
		return answer;
		
	} // solution1
	
	public int[] solution2(long n) {
		
		char[] arr = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
		/* Builder와 Buffer 차이
		1.스트링버퍼 - 동기화를 지원하며 멀티스레드 환경에서 안전하다.
		2.스트링빌더 - 동기화를 지원하지 않기 때문에 멀티 스레드 환경에서는 
		적합하지 않지만 단일 스레드 환경에서는 스트링버퍼보다 성능이 더 좋다.
		*/
		int[] answer = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			answer[i] = arr[i] - 48;
			System.out.print(answer[i] + " ");
			
		}
		
		return answer;
		
	} // solution2
	
	//  ? --> Character.getNumericValue : char 값 -> int 값 변형 
    public int[] solution3(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
	
}
