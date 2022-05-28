package com.java.DateTime;

import java.time.Clock;

public class DateTime extends DateTimeUtility
{
	public void currentDate()
	{
		System.out.println("Current Date is: " +objlocal);
	}
	public void currentTime()
	{
		System.out.println("Current Time is: " +objtime);
	}
	public void currentDateTime()
	{
		System.out.println("===========================");
		System.out.println("Current Date and Time is: " +objdatetime);		
	}
	public void UTCformat()
	{
		System.out.println("===========================");
		System.out.println("Time in UTC form: "+Clock.systemUTC().instant());
	}
	public void formattedDate()
	{
		System.out.println("===========================");
		System.out.println("Formatted Date: "+objdateformat.format(now));
		System.out.println("===========================");
		System.out.println("Current Day and date : "+date);
	}
	
	public void monthDate()
	{
		System.out.println("===========================");
		System.out.println("Current Month and date is: "+localdate);
		System.out.println("===========================");
		System.out.println("Valid date:" +booleanMonth);
		System.out.println("===========================");
		System.out.println(" " +valueOne);  
		System.out.println(" " +valueTwo);   
	}
	public void offsetTime()
	{
		System.out.println("===========================");
		System.out.println("Total hours: " +inthour +" hours"); 
		System.out.println("Total Minutes: " +intmin + " mins");
		System.out.println("Total Seconds: " +intsec+ " secs"); 
		System.out.println("===========================");
		System.out.println("Day of the week: " +offdatetime.getDayOfWeek());
	}
}
