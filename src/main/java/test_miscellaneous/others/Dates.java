package test_miscellaneous;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class Dates {
	public static void main(String args[])
	{
		 Date gmtTime = new Date();
         SimpleDateFormat gmtFormat = new SimpleDateFormat("MM/dd/yyyy");
         gmtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
         String gmtdate = gmtFormat.format(gmtTime);
         System.out.println("present date="+gmtdate);
         
         String startDate="present - 5 months";
         int amt = Integer.parseInt(startDate.replaceAll("[^0-9]", ""));
         System.out.println("no="+amt);

        if(StringUtils.containsIgnoreCase(startDate, "month"))
        	System.out.println("---------true");
}
}
