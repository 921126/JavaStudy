package Day05;

public class Programmers_Quiz03 {
	
	public static void main(String[] args) {
		
		int[] arr = {11,7};
		Solution3 sl = new Solution3();
		System.out.println(sl.solution(arr));
		
	}

}
class Solution3 {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        //System.out.println(max);
        //System.out.println(min);
        
        //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        for(int i = 1; i <=max; i++) {
        	if(max < min + i) {
        		answer++;
        	}
        }
        
        for(int i = max; i <= max+min; i++) {
        	if(i < max+min && i!=max) {
        		answer++;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}