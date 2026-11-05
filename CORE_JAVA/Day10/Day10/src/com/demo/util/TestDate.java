package com.demo.util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
// legacy    java 1
import java.util.Date;
import java.util.Scanner;
public class TestDate {

	public static void main(String[] args) {
		Date d = new Date();	
		System.out.println(d);
		SimpleDateFormat sd ; 
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		System.out.println(ld.getMonthValue());
		
		System.out.println(ld.getMonth());
		
		System.out.println(ld.minusDays(10));
		
		DateTimeFormatter formatter =
				DateTimeFormatter.ofPattern("dd-MM-yy");
		
		// LocalDate ---> String
        String formattedString = ld.format(formatter);

        System.out.println(formattedString);
		//DateFormat  
     
       // System.out.println("Enter BirthDate  dd/mm/yyyy");
        //String  bDate = new Scanner(System.in).next(); 
        //LocalDate b = LocalDate.parse(bDate);
        // String   ---- LocalDate 
        
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEE dd-LLLL-yyyy");
        String formattedString1 = ld.format(formatter1);
        System.out.println(formattedString1);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
		LocalDate l1 = LocalDate.parse("2025-09-12");

		System.out.println(l1);

		System.out.println(l1.minusDays(5));

	 Period period = Period.between(l1 , ld);
	 System.out.println(period);//P11M22D
	System.out.println
	(period.getMonths() + " months " + period.getDays() + "days");


	}

}






