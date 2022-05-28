package com.java.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.time.*;
	
public class DateTimeUtility 
{
	//Display Current date 
	LocalDate objlocal = LocalDate.now();
	//Display Current time 
	LocalTime objtime = LocalTime.now();
	//Display Current Time n Date
	LocalDateTime objdatetime = LocalDateTime.now();
	
	/*SimpleDateFormat formatDateTime = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
	DateTime objdate = new DateTime();
    formatDateTime.setTimeZone(TimeZone.getTimeZone("IST"));
    System.out.println(formatDate.format(objdate));*/
	
	DateTimeFormatter objdateformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now(); 
	// Date - day and time format
	java.util.Date date = new java.util.Date();    
	
	//Month Day example
	MonthDay month = MonthDay.now();
	LocalDate localdate = month.atYear(1994);
	boolean booleanMonth = month.isValidYear(2022);  
	ValueRange valueOne = month.range(ChronoField.MONTH_OF_YEAR);  
	ValueRange valueTwo = month.range(ChronoField.DAY_OF_MONTH);  
	
	OffsetTime offset = OffsetTime.now();  
    int inthour = offset.get(ChronoField.HOUR_OF_DAY);  
    int intmin = offset.get(ChronoField.MINUTE_OF_DAY);  
    int intsec = offset.get(ChronoField.SECOND_OF_DAY);  
    
    OffsetDateTime offdatetime = OffsetDateTime.now();
    
    
	
	
}


