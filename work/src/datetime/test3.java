package datetime;

import java.time.LocalDate;
import java.time.Period;

public class test3 {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		LocalDate dob= LocalDate.of(1999, 6, 1);
		Period period=Period.between(dob,today);
		System.out.printf("%d years, %d months, %d days ",period.getYears(),period.getMonths(),period.getDays());
		
		
 	}

}
