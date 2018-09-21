package test_miscellaneous.poimodules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//this program just writes
public class Rw {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream out = new FileOutputStream(new File("./write.xlsx"));
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 
	        // Create a blank sheet
		 int r=0,c=0;
	        XSSFSheet sheet = workbook.createSheet("student Details");
	        Row row;
	        Cell cell;
	        String key="ferdi";
	        for(r=0;r<10;r++)
	        {
	        	 row = sheet.createRow(r);
	        	for(c=0;c<10;c++)
	        	{
	        		
	     	        cell = row.createCell(c);
	        		cell.setCellValue(key);
	        	}
	        	
	        }
	        
	        
	        workbook.write(out);
            out.close();
	}

	

}
