package Day01;

import java.util.Scanner;

public class chapter4 {

	public static void main(String[] args) {

		//4-5
		//		Exercise4_5();

		//4-6
		//		Exercise4_6();
		//		
		//		//4-7
		//		Exercise4_7();
		//		
		//		//4-8
		//		Exercise4_8();
		//		
		//		//4-9
		//		Exersice4_9();

//		//4-10
//		Exersice4_10();
//
//		//4-11
//		Exersice4_11();
//		
//		//4_12
//		Exersice4_12();
		
		//4-13
//		Exersice4_13();
		
		//4-14
//		Exersice4_14();

		//4-15
		Exersice4_15();
	}

	static void Exercise4_5() {
		//		for(int i = 0; i <= 10; i++) {
		//			for(int  j= 0; j<=i; j++) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}

		System.out.println();
		int i =0;
		String str = "";
		while(i <=10) {
			str += "*";
			System.out.println(str);
			i++;
		}
	}

	static void Exercise4_6(){

		for(int i = 1; i <= 6; i++) {
			for(int j = i; j<= 6; j++) {
				if(i+j == 6) {
					System.out.println("[" + i + "," + j + "]");
				}
			}
		}

	}

	static void Exercise4_7() {

		int value = (int)(Math.random()*6)+1;
		System.out.println("value:" + value );

	}

	static void Exercise4_8() {

		for(int i = 0; i <= 10; i++) {
			for(int j =0; j <= 10; j++) {
				if((2*i)+(4*j) ==10) {
					System.out.println("x: " + i +","+ " y: " + j);
				}
			}
		}

	}

	static void Exersice4_9() {
		String str = "12345";
		int sum = 0;
		char tmp;
		for(int i = 0; i<str.length(); i++) {
			tmp =  str.charAt(i);
			sum += Integer.parseInt(String.valueOf(tmp));
		}
		System.out.println(sum);
	}

	static void Exersice4_10() {

		int num = 12345;
		int n1 = num %10000; //2345
		int n2 = n1 % 1000; //345
		int n3 = n2 % 100; //45
		int n4 = n3 % 10; //5
		int sum = (num/10000) + (n1/1000) + (n2/100) + (n3/10) + n4;

		System.out.println("sum=" + sum);

	}

	static void Exersice4_11() {

		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + "," + num2);

		for(int i = 0; i < 8; i++) {

			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print("," + num3);
		}
	}

	static void Exersice4_12() {

		for(int i=2; i<=9; i+=3) {
			for(int j =1; j<=3; j++) {
				System.out.print(i   + " X " + j + " = " + i*j + "\t");
				System.out.print(i+1 + " X " + j + " = " + (i+1)*j + "\t");
				if(i+2 < 10) {
					System.out.print(i+2 + " X " + j + " = " + (i+2)*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	static void Exersice4_13() {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i =0; i< value.length(); i++) {
			ch = value.charAt(i);
			for(int j = 48; j <= 57; j++) {
				if(ch != j) {
					isNumber =false;
				}
			}
		}
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		}else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
		
	}

	static void Exersice4_14() {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
//		System.out.println(answer);
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			input = sc.nextInt();
			
			if(input == answer) {
				sc.close();
				break;
			}else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}else {
				System.out.println("더 작은 수를 입력하세요.");
			}
		}while(true);
		System.out.println("몇번만에 맞췄냐면~ :" + count);
		
	}

	static void Exersice4_15() {
		
		int num = 12321;
		int tmp = num;
		
		int result =0;
		while(tmp != 0) {
			
			result = result*10 + tmp%10;
			tmp = tmp/10;
		}
		
		if(num == result) {
			System.out.println(num + "는 회문수 입니다.");
		}else {
			System.out.println(num + "는 회문수가 아닙니다.");
		}
		
		char ch = ' ';
		System.out.println(ch);
	}
}
