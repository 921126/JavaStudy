package Day06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX02 {
	
	public static void main(String[] args) {
	
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 0, 1);
		System.out.println(paychek(fromCal, toCal));
		
		fromCal.set(2010, 0, 21);
		toCal.set(2010, 0, 21);
		System.out.println(paychek(fromCal, toCal));
		
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 1);
		System.out.println(paychek(fromCal, toCal));
		
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 23);
		System.out.println(paychek(fromCal, toCal));
		
	}

	static int paychek(Calendar from, Calendar to) {
		
		int result = 0;
		
		if(from == null || to == null) {
			result = 0;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String fdate = sdf.format(from.getTime());
		String tdate = sdf.format(to.getTime());

		//시작하는 년원일
		int fyear = from.get(Calendar.YEAR);
		int fmonth = from.get(Calendar.MONTH);
		int fday = from.get(Calendar.DAY_OF_MONTH);
		
		//끝나는 년원일
		int tyear = to.get(Calendar.YEAR);
		int tmonth = to.get(Calendar.MONTH);
		int tday = to.get(Calendar.DAY_OF_MONTH);
		
		if(fmonth == 0) {
			fmonth = 1;
		}
		
		
		//개월수구하기
		result = (tyear * 12 + tmonth) - (fyear * 12 + fmonth);
		
		if(result < 0) {
			result = 0;
		}
		
		//날짜 따지기
		if(fday <= 21 && tday >= 21) {
			result++;
		}
		
		if(fday>21 && tday < 21) {
			result--;
		}
		
		
		return result;
	}
}
