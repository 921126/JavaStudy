package Day02;

import java.util.Arrays;

public class Programmers_Quiz03 {
	public static void main(String[] args) {
		
		Solution3 sl3  = new Solution3();
		System.out.println(sl3.solution("one4seveneight"));
	}
}

class Solution3{
	
	public int solution(String s) {
		int answer =0;
		String ee ="";
		String[] nArr = {"0", "1", "2","3","4","5","6","7","8","9"};
		String[] sArr = {"zero","one", "two", "three", "four", "five", "six","seven", "eight", "nine"};
		
		for(int i =0; i<nArr.length; i++) {
			String e = s.replaceAll(sArr[i], nArr[i]);
			s = e;
		}
		answer = Integer.parseInt(s);
		
		return answer;
	}
}