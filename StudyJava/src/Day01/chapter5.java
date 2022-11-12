package Day01;

import java.util.Arrays;

public class chapter5 {

	public static void main(String[] args) {

		//5-3
		//		Exercise5_3();
		//		
		//		//5-4
		//		Exersice5_4();

		//5-5
		//		Exersice5_5();

		//5-6
		//		Exersice5_6();

		//5-7
		//		Exersice5_7(1240);

		//5-8
		//		Exersice5_8();

		//5-9
		//Exersice5_9();

		//5-10
				Exersice5_10();

		//5-11
		//Exersice5_11();
	}

	static void Exercise5_3() {

		int[] arr = {10,20,30,40,50};
		int sum =0;

		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("sum = " + sum);

	}

	static void Exersice5_4() {

		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};

		int total = 0;
		float average = 0;

		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j <5; j++) {

				total += arr[i][j];
			}
		}

		average = (float)total/20;

		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}

	static void Exersice5_5() {
		int[] ballArr = {1,2,3,4,5,6,7,9};
		int[] ball3 = new int[3];

		//배열의 임의 요소를 골라서 위치 바꾸기
		for(int i = 0; i < ballArr.length; i++) {

			int j = (int)(Math.random() * ballArr.length); //공의 인덱스
			int tmp = 0;

			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		//배열 복사해서 넣기
		for(int i =0; i < ball3.length; i++) {

			ball3[i] = ballArr[i];
		}
		System.out.println(Arrays.toString(ballArr));
		System.out.println(Arrays.toString(ball3));

	}

	static void Exersice5_6() {
		//큰 금액의 동전을 우선적으로 제공한다.
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money =" + money);

		int coin1 = 0;
		int coin2 = 0;
		int coin3 =0;
		int coin4 =0;
		for(int i = 0; i <coinUnit.length; i++) {
			if(coinUnit[i] == 500) {
				coin1 = money/coinUnit[i];
				money = money%coinUnit[i];
			}else if(coinUnit[i] == 100) {
				coin2 = money/coinUnit[i];
				money = money%coinUnit[i];
			}else if(coinUnit[i] == 50) {
				coin3 = money/coinUnit[i];
				money = money%coinUnit[i];
			}else if(coinUnit[i] == 10) {
				coin4 = money/coinUnit[i];
				money = money%coinUnit[i];
			}
		}
		System.out.println("500원: " + coin1);
		System.out.println("100원: " + coin2);
		System.out.println("50원: " + coin3);
		System.out.println("10원: " + coin4);

	}

	static void Exersice5_7(int m) {

		System.out.println("money= " + m);

		int[] coinUnit = {500,100,50,10};
		int[] coin = {5,5,5,5};

		for(int i = 0; i < coinUnit.length; i++) {

			int coinNum=0;
			//1. 금액을 동전단위로 나눠서 필요한 동전의 개수 구하기
			if(coinUnit[i] == 500) {
				coinNum = m/coinUnit[i];
				if(coin[i] > coinNum) {
					coin[i] -= coinNum; 
					m -= coinNum * coinUnit[i];
				}else {
					coinNum = coin[i];
					coin[i] -= coin[i];
				}
			}else if(coinUnit[i] == 100) {
				coinNum = m/coinUnit[i];
				if(coin[i] > coinNum) {
					coin[i] -= coinNum; 
					m -= coinNum * coinUnit[i];
				}else {
					coinNum = coin[i];
					coin[i] -= coin[i];
				}
			}else if(coinUnit[i] == 50) {
				coinNum = m/coinUnit[i];
				if(coin[i] > coinNum) {
					coin[i] -= coinNum; 
					m -= coinNum * coinUnit[i];
				}else {
					coinNum = coin[i];
					coin[i] -= coin[i];
				}
			}else {
				coinNum = m/coinUnit[i];
				if(coin[i] > coinNum) {
					coin[i] -= coinNum; 
					m -= coinNum * coinUnit[i];
				}else {
					coinNum = coin[i];
					coin[i] -= coin[i];
				}
			}
			System.out.println(coinUnit[i]+"원: " +coinNum);
		}
		if(m > 0) {
			System.out.println("거스름돈이 부족합니다.");
		}
		System.out.println("=남은 동전의 개수=");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + coin[i]);
		}
	}

	static void Exersice5_8() {
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];

		//숫자의 갯수 카운트
		for(int i = 0; i < answer.length; i++) {
			counter[answer[i]-1]++;
		}

		//출력
		for(int i =0; i<counter.length; i++) {
			System.out.print(counter[i] + ":");
			for(int j = 0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void Exersice5_9() {

		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};

		char[][] result = new char[star[0].length][star.length];

		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);                                                                                                                                                                                        
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("별길이" + star.length);
		System.out.println("별길이" + star[0].length);
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {

				result[j][i] = star[3-i][j];
			}
		}

		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}


	}

	static void Exersice5_10() {

		char[] abcCode = 
			{ '`','~','!','@','#','$','%','^','&','*',
					'(',')','-','_','+','=','|','[',']','{',
					'}',';',':',',','.','/'};

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";

		//문자열의 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장하기
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			//아스키코드 사이의 문자라면 빼서 누적저장
			if('a' <= ch && ch <= 'z') {
				result += abcCode[ch -'a'];

			}else if('0' <= ch && ch<= '9'){
				result += numCode[ch - '0'];
			}
		}

		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}

	static void Exersice5_11() {

		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
		};

		System.out.println("배열크기[" + (score.length+1) + "," + (score[0].length+1) + "]");
		System.out.println(score[0].length);
		int[][] result = new int[score.length+1][score[0].length+1];

		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {

				result[i][j] = score[i][j];
				
				if(i == 0 && j < score[i].length) {
					result[0][score[j].length] += score[0][j]; 
					
				}else if(i == 1 && j < score[i].length) {
					result[1][score[j].length] += score[1][j];
					
				}else if(i == 2 && j < score[i].length) {
					result[2][score[j].length] += score[2][j];
					
				}else if(i == 3 && j < score[i].length) {
					result[3][score[j].length] += score[3][j];
					
				}else if(i == 4 && j < score[i].length) {
					result[4][score[j].length] += score[4][j];
					
				}
				
				if(j == 0 && i <score.length) {
					result[5][j] += score[i][0];
				}else if(j == 1 && i <score.length) {
					result[5][j] += score[i][0];
				}else if(j == 2 && i <score.length) {
					result[5][j] += score[i][0];
				}else if(j == 3 && i <score.length) {
					result[5][j] += score[i][0];
				}else if(j == 4 && i <score.length) {
					result[5][j] += score[i][0];
				}
				
				result[score.length][score[0].length] += score[i][j];
			}
		}

		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}



	}


}
