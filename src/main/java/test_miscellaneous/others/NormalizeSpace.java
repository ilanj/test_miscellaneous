package test_miscellaneous;

import org.apache.commons.lang3.StringUtils;

public class NormalizeSpace {
	public static void main(String args[])
	{
		String name="    .Matt,     hardy";
		name=name.replace(",", " ");
		name=StringUtils.normalizeSpace(name);
		System.out.print(name);
	}

}
