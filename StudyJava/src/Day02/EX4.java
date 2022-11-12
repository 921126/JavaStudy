package Day02;

import java.util.Arrays;

public class EX4 {
	
	public static void main(String[] args) {
		
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

	static int[] shuffle(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int a = (int)(Math.random()*arr.length);
			int tmp = arr[a];
			arr[a] = arr[i];
			arr[i] = tmp;
		}
		
		
		return arr;
	}
}
