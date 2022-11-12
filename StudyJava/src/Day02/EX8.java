package Day02;

public class EX8 {

	public static void main(String[] args) {
		
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
		
	}

	static int abs (int value) {
		int answer = 0;
		if(value > 0) {
			answer = value;
		}else if(value < 0) {
			answer = value* -1;
		}
		
		return answer;
	}
}


