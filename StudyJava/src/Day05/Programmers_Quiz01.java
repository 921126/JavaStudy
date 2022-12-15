package Day05;

import java.util.*;

public class Programmers_Quiz01 {

	public static void main(String[] args) {

		Solution sl = new Solution();
		System.out.println(sl.solution(40));

	}

}

class Solution {
	public int solution(int n) {
		int answer = 1;

		HashSet<Integer> set = new HashSet<>();

		int i = 1;
		while(set.size() < n) {
			if(i % 3 != 0) { //3의 배수가 아니라면
				if(i % 10 != 3) { //3으로 나누어 떨어지는 수가 아니라면
					if(Integer.toString(i).matches("(.*)3(.*)") == false)
						set.add(i);
				}
			}
			i++;
		}
		
		Integer[] arr = set.toArray(new Integer[0]);
		Arrays.sort(arr);
		
		answer = arr[arr.length-1];

		return answer;
	}
}