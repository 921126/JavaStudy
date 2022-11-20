package Day03;

import java.util.Arrays;

public class Programmers_Quiz01 {

	public static void main(String[] args) {

		String[] arr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		Solution sl = new Solution();
		System.out.println(sl.solution(arr));
	}

}
class Solution {
	public int solution(String[] babbling) {
		int answer = 0;

		String[] arr = {"aya", "ye", "woo", "ma"};

		//예제 배열을 별도의 스트링으로 담기
		for(String str : babbling) {
			for(int i =0; i < arr.length; i++) {
				//만약에 문자열에 발음할수있는 단어가 있다면
				if(str.indexOf(arr[i]) != -1) {
					//문자열 단어변경
					str = str.replace(arr[i], "+");
				}
			}
			//만약에 바뀐 문자열의 생김새가 이렇게 생겼다면 answer 더하기
			if(str.equals("+")){ 
				answer++; 
				}
			if(str.equals("++")){ 
				answer++;
				}
			if(str.equals("+++")){ 
				answer++; 
				}
			if(str.equals("++++")){
				answer++;
				}
		}
		return answer;
	}
}