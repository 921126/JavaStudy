package Day02;

import java.util.Arrays;

public class EX7 {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {}));
		
	}
	
	static int max (int[] arr) {
		int answer = 0;
		
		try {
			Arrays.sort(arr);
			answer = arr[arr.length-1];
			if(arr.length == 0) {
				answer = -999999;
			}
			
		} catch (Exception e) {
			answer = -999999;
		}
		
		
		return answer;
	}
	
}
