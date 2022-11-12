package Day01;

public class chapter3 {

	public static void main(String[] args) {

		// 3-2
		Exercise3_2();

		// 3-3
		Exercise3_3();

		//3-4
		Exercise3_4();
		
		//3-5
		Exercise3_5("333");
		
		//3-6
		Exercise3_6(81);
		
		//3-7
		Exercise3_7();
		
		//3-8
		Exercise3_8();
		
		//3=9
		Exercise3_9();
		
		//3-10
		Exercise3_10();
	}

	static void Exercise3_2() {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket) +1;
		
		/*if(numOfApples % sizeOfBucket > 0) {
			numOfBucket = (numOfApples/sizeOfBucket) +1;
		}else if(numOfApples % sizeOfBucket == 0) {
			numOfBucket = (numOfApples/sizeOfBucket);
		}*/
		System.out.println("필요한 바구니의 수:" + numOfBucket);
	}
	
	static void Exercise3_3() {
		
		int num =0;
		String result = "";
		
		result = num == 0 ? "0" : "숫자";
		if(result.equals("숫자")) {
			result = num % 2 == 0 ? "양수" : "음수"; 
		}
		System.out.println(result);
		
	}

	static void Exercise3_4() {
		int num = 456;
		System.out.println((num/100)*100);
	}

	static void Exercise3_5(String num) {
		
		int n = Integer.parseInt(num);
		int hun = n % 100;
		System.out.println(hun + "1");
	}

	static void Exercise3_6(int num) {
		
		int result = num % 10;
		
		System.out.println(10-result);
	}
	
	static void Exercise3_7() {
		
		int fahrenheit = 100;
		float celcius = (5/9f*(fahrenheit -32));
		String str = String.format("%.2f", celcius);
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + str);
	}

	static void Exercise3_8() {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b); //수정
		
		char ch = 'A'; //아스키코드65
		ch = (char) (ch +2); //수정 해서 'C' 또는 67
		
		float f = 3/2f; //수정 f붙이기
		long l = 3000L * 3000 * 3000; //수정 L붙이기
		
		float f2 = 0.1f;
		double d = 0.1;

		boolean result = (float)d == f2; //수정 double d를 float으로 형변환
		
		System.out.println("c= " + c);
		System.out.println("ch= " + ch);
		System.out.println("f= " + f);
		System.out.println("l= " + l);
		System.out.println("result=" + result);
		
		
	}

	static void Exercise3_9() {
		char ch ='가';
		boolean b = false;
		
		for(int i = 65; i <= 122; i++) {
			if(ch == i) {
				b = true;
			}
		}
		System.out.println(b);
	}
	
	static void Exercise3_10() {

		char ch = 'A';
		char lowerCase = (char) (ch < 97 ? ch+32 : 0);
		System.out.println("ch: " + ch);
		System.out.println("ch to lowerCase: " + lowerCase);
	}
}




