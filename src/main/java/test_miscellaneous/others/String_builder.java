package test_miscellaneous;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class String_builder {
	public static void main(String args[])
	{
		StringBuilder data =new StringBuilder("qbkqecbqhjqhjc");
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File("./report.txt")));
            String line="";
            while(line != null)
            {
            	line = in.readLine();
            	if(line!=null)
               data.append("\n"+line);
            }
            in.close();
           // data = line.toString();
            //System.out.println("3643"+string);
            //data=data.toString();
            System.out.println(data);
           // System.out.println("3643"+line);

        }
        catch (IOException ioe) {
            System.err.println("Oops: " + ioe.getMessage());
        }
            
	}

}
