package test_miscellaneous;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StrDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String ip="2018-02-12 22:50:22";
		String temp[]=ip.split(" ");
		System.out.print(temp[0]);
		char[] each=ip.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(temp[0]);
		sb.append(' ');
		for(char ch:each)
		{
			if(ch!='-'&&ch!=':'&&ch!=' '&&ch!='0')
				sb.append(ch);
		}
		sb.append(".tiff");
		sb.insert(12, '0');
		System.out.println();
		System.out.println(sb);
		System.out.println(datechange("2018-02-12 23:37:10"));
		//date
		
	}
	public static String datechange(String data) throws ParseException {
		  String FileName = "";
		  String[] value = data.split(" ");
		  
		  DateFormat inFormat = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss");
		  Date mydate = inFormat.parse(data);
		  
		  SimpleDateFormat date1 = new SimpleDateFormat("yyyyMdHms");
		  String content = date1.format(mydate);
		  
		  FileName = value[0]+" "+content+".tiff";
		  System.out.println(FileName);
		  return FileName;
		  
		 }

}
//2018-02-07 20182722819.tiff