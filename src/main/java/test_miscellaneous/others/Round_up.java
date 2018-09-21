package test_miscellaneous;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Round_up {
	public static void main(String args[]) throws ParseException
	{
		/*double d=23.45698741236547;
		System.out.println(d);
		DecimalFormat df=new DecimalFormat("0.00");
		String formate = df.format(d); 
		d = (Double)df.parse(formate) ;*/
		//
		double currentPass=278.36985214789654;
        //roundup to 2 decimal places
		DecimalFormat df=new DecimalFormat("0.00");
        String formate1 = df.format(currentPass);
        
        currentPass = (Double)df.parse(formate1) ;
		System.out.println(currentPass);
		//other method
		double d1=145.369852147963;
		d1=Math.round( d1 * 100.0 ) / 100.0;
		System.out.println(d1);
	}

}
