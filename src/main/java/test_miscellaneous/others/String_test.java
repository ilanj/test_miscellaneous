package test_miscellaneous;

import org.apache.commons.lang3.StringUtils;

public class String_test {
	public static void main(String args[])
	{
		String name=null, f_name=null,l_name;// name will work fine for all '',null and just declaration
		f_name="    ilanchezhian  hhiuh   huh      iihh    ";
		f_name=f_name.replaceAll(" ", "");
		f_name=f_name.trim();
		l_name="jayamurthy";
		name=f_name+l_name;
		System.out.println("f_name="+f_name);
		f_name=StringUtils.normalizeSpace(f_name);
		if(StringUtils.equalsAny("sfgsgs","grgrsfgsgsgrg"))
		{
			System.out.println("true and equal");
		}
		
	}
	
	

}
