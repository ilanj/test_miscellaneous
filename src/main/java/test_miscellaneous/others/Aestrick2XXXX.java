package test_miscellaneous;

public class Aestrick2XXXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip,op;
		ip="***-***-2359";
		op="XXX-XXX-2359";
		ip=ip.replace('*','x');
		System.out.println(ip);
		if(ip.equalsIgnoreCase(op))
			System.out.println("test pass");
		

	}

}
