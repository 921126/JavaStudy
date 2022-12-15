package Day04;

public class Programmers_Quiz02 {

	public static void main(String[] args) {

		Solution2 sl = new Solution2();
		System.out.println(sl.solution(1081));
	}
}

class Solution2 {
	public int solution(int chicken) {
		int answer = 0;
		
		while(chicken >= 10) {
			
			int cupon = chicken / 10;  //치킨
			int tmp = chicken % 10; //쿠폰

			chicken = cupon + tmp;
			answer += cupon;

		}

		return answer;
	}
}
