package Day04;
import java.math.BigInteger;

public class Programmers_Quiz01 {
	
	public static void main(String[] args) {
		
		Solution sl = new Solution();
		System.out.println(sl.solution(3, 2));
	}

}

class Solution {
    public BigInteger solution(int balls, int share) {
          	BigInteger bFac = fac(balls);
    	BigInteger sFac = fac(share);
    	//System.out.println(sFac);       
    	
    	BigInteger multi = fac(balls-share).multiply(sFac);
    	BigInteger divide = bFac.divide(multi);
    	
      // String str = Long.toString(bFac / (fac(balls-share)* sFac));
       BigInteger answer = divide;
       
       
        return answer;

    }
    
    public BigInteger fac (int n) {
    	
    	BigInteger fac = BigInteger.ONE;
    	for(int i = 1; i <= n; i++) {
    		
    		fac = fac.multiply(BigInteger.valueOf(i));
    	}
    	return fac;
    }
}