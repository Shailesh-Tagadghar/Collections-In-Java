package Features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public static void main(String[] args) {
		System.out.println("Local Date only shows the system date");
		LocalDate LD = LocalDate.now();
		System.out.println(LD);
		
		System.out.println();
		
		System.out.println("Local Time only shows the system Time");
		LocalTime LT = LocalTime.now();
		System.out.println(LT);
		
		System.out.println();
		
		System.out.println("Local Date,Time shows the system Date and Time");
		LocalDateTime LDT = LocalDateTime.now();
		System.out.println(LDT);
		
		System.out.println();
		
		System.out.println("Date Formmater's");
		
		LocalDate dob = LocalDate.of(2002, 06, 13);
		System.out.println(dob);
		
		Duration d;
		Period p;
		ZonedDateTime z;
		System.out.println();
		
		p = Period.between(dob, LocalDate.now());
		System.out.println(p);
		
		System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String f = LDT .format(formatter);
		System.out.println(f);
		
	}
}
