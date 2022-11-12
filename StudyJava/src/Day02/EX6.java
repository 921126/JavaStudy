package Day02;

public class EX6 {
	
	public static void main(String[] args) {
	
		String str = "123";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까?" + isNumber(str));
	}
	static boolean isNumber(String str) {
		
		boolean ck = false;
		try {
		
			int num = Integer.parseInt(str);
			ck = true;
			
		} catch (Exception e) {

			ck = false;
		}
		
		return ck;
	}

}
