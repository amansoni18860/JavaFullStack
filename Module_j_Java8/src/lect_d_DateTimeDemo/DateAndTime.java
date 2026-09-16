package lect_d_DateTimeDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateAndTime {

	public static void main(String[] args) {
    
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.println(dd+"..."+mm+"..."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
	
		System.out.println();
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		
		
		LocalDateTime dtt=LocalDateTime.of(1995, Month.MAY,28,12,45);
		System.out.println(dtt);
		
		System.out.println("Before Six Months : "+dtt.minusMonths(6));
		System.out.println("After Six Months : "+dtt.plusMonths(6));
		
		
		LocalDate birthday=LocalDate.of(2002, 10,28);
		
		LocalDate today=LocalDate.now();
		
		Period p=Period.between(birthday, today);
		
		System.out.printf("Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
	}

}

