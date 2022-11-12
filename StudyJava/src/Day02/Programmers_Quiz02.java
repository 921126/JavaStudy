package Day02;

import java.io.*;
import java.util.*;

public class Programmers_Quiz02 {

	public static void main(String[] args) {

		int[] arr = {0};


		Solution2 sl2 = new Solution2();
		System.out.println(sl2.solution(arr));
	}
}

class Solution2{

	public int solution(int[] array) {
		int answer = 0;
		int count;

		//배열의 값 Integer 변경
		Integer[] arr = new Integer[array.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}

		//set을 이용해서 중복값 제거한 리스트 생성
		Set<Integer> arr2 = new HashSet<Integer>(Arrays.asList(arr));

		//중복값을 제거한 set을 다시 배열로 변경 > 사용
		Integer[] dArr = arr2.toArray(new Integer[0]); //배열크기를 0으로 지정시 자동으로 배열크기가 지정

		//카운트를 위한 배열 > 사용
		int[] cArr = new int[dArr.length];

		//중복횟수 확인
		for(int i =0; i < dArr.length; i++) {
			count =0; // 중복값 카운트를 위해 리셋 
			for(int j = 0; j<array.length; j++) {
				if(dArr[i] == array[j]) {
					count++;
					cArr[i] = count;
				}
			}
		}

		int max = 0;
		//결과출력
		
		for(int i =0; i < cArr.length; i++) {
			if(cArr[i] > max) {
				max = cArr[i];
				answer = dArr[i];
			}else if(cArr[i] == max) {
				answer = -1;
			}
		}
		
		return answer;

	}

}
