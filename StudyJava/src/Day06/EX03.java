package Day06;

import java.text.DecimalFormat;
import java.text.ParseException;

public class EX03 {
	
	public static void main(String[] args) {
		
		String date = "123,456,789.5";
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,#####");
		
		try {
			Number num = df.parse(date);
			double d = num.doubleValue();
			
			System.out.println("date:" + date);
			System.out.println("반올림:" + Math.round(d));
			System.out.println("만단위:" + df2.format(d));
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
