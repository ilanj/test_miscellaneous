package test_miscellaneous;

import java.util.Calendar;
import java.util.Date;

public class DateTimePrint {
	@SuppressWarnings("deprecaltion")
	public static void main(String args[])
	{
		Date date=Calendar.getInstance().getTime();
		System.out.println(date.getDate()+"-"+date.getMonth()+"-"+date.getYear());
		System.out.println(date.getDate()+"-"+date.getMonth()+"-"+date.getYear());
	}

}
