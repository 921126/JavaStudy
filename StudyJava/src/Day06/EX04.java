package Day06;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX04 {
	
	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력한 날짜는 E요일";
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		System.out.println(df);
		System.out.println(df2);
		
		Scanner sc = new Scanner(System.in);
		Date d = null;
		
		do {
			
			System.out.println("날짜를 yyyy/MM/dd형태로 입력해주세요.(예시:2007/05/11)");
			System.out.print(">>");
			try {
				d = df.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (true);
		
		System.out.println(df2.format(d));
	}

}
