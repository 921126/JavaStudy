package Day06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EX01 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 1);
		
		for(int i = 0; i <12; i++) {
			
			int week = cal.get(Calendar.DAY_OF_WEEK);
			int sunday = (week == 1) ? 8 : 16 - week;
			
			cal.set(Calendar.DAY_OF_MONTH, sunday);
			
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd는 F번째 E요일").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		
	}

}
