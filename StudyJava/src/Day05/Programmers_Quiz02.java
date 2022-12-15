package Day05;

public class Programmers_Quiz02 {
	
	public static void main(String[] args) {
		
		int[][] arr = { {-2, -1}, 
						{1, 1}, 
						{1, -1}, 
						{-1, 1} };
		Solution2 sl = new Solution2();
		System.out.println(sl.solution(arr));
	}

}

class Solution2 {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];
        
        //맥스값 구하기
        for(int i = 0; i< 4; i++) {
        	for(int j = 0; j < 2; j++) {
        		
        		if(maxX <= dots[i][0]) {
        			maxX = dots[i][0];
        		}
        		if(minX >= dots[i][0]) {
        			minX = dots[i][0];
        		}
        		if(maxY <= dots[i][1]) {
        			maxY = dots[i][1];
        		}
        		if(minY >= dots[i][1]) {
        			minY = dots[i][1];
        		}
        		
        	}
        }
        
//        System.out.println(maxX + " - " + minX);
//        System.out.println(maxY + " - " + minY);
        
        int x = 0;
        int y = 0;
        for(int i = 0; i <= 1000; i++) {
        	if(maxX == i + minX) {
        		x = i;
        	}
        	if(maxY == i + minY) {
        		y = i;
        	}
        }
//        System.out.println(x);
//        System.out.println(y);
        return answer = x*y;
    }
}