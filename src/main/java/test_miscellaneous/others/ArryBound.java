package test_miscellaneous;

public class ArryBound {
	private static int succ[]=new int[3];
	private static int fail[]=new int[3];
	public static int i;
	public static void main(String args[])
	{
		for (i = 0; i < 3; i++)
		{
            succ[i] = 0;
            fail[i] = 0;
		}
		System.out.println("after beaking i value"+i);
		for (i = 0; i < 3; i++)
		{
            System.out.println(succ[i]+"     "+fail[i]);
		}
		System.out.println("after beaking i value"+i);
	}

}
