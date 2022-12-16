package Day06;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class EX05 {
	
	public static void main(String[] args) {
		
		LocalDate bday = LocalDate.of(1992,11,26);
		LocalDate now = LocalDate.now();
		
		long days = bday.until(now, ChronoUnit.DAYS);
		
		System.out.println("얼마나 지남? " + days +"일");
		
		
	}

}
