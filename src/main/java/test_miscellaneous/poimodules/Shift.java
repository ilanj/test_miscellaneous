package test_miscellaneous.poimodules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFColor;


public class Shift {

	
//row count starts from 0 and colcount sarts from 1
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./data.xlsx");
			Workbook w=new XSSFWorkbook(f);
			Sheet s=w.getSheet("Sheet1");
			int rowcount=s.getLastRowNum();
			int colcount=s.getRow(0).getLastCellNum();
			System.out.println("row count="+rowcount+"\n column count="+colcount);
			int i,j;
			for(i=0;i<colcount;i++)
			{
			for(j=0;j<=rowcount;j++)
			{
				String key=s.getRow(j).getCell(i).getStringCellValue();
				System.out.print(key);
			}
			System.out.println();
			}
			//write------------------------------------
			FileOutputStream out = new FileOutputStream(new File("./write1.xlsx"));
			 //XSSFWorkbook workbook = new XSSFWorkbook();
			 
		        // Create a blank sheet
			// XSSFCellStyle redStyle, greenStyle;
			 int r=0,c=0;
		        Sheet sheet = w.getSheetAt(0);
		        Row row;
		        row = sheet.getRow(r);
		        Cell cell;
		        String key="123";
		       
		        	//sheet.shiftRows(r,sheet.getLastRowNum(),1);
		        	 //row = sheet.createRow(r);
		        	 sheet.shiftRows(3,sheet.getLastRowNum(),1);
		        	 row = sheet.createRow(3);
		        	
		        	 

		     	        cell = row.createCell(c);
		        		cell.setCellValue(key);
		        	
		       /* Sheet sheet1=w.getSheetAt(0);
		       // XSSFSheet sheet1 = workbook.createSheet("address");
		        for(r=0;r<10;r++)
		        {
		        	 row = sheet1.createRow(r);
		        	for(c=0;c<10;c++)
		        	{
		        	    cell = row.createCell(c);
		        		cell.setCellValue("gfgf");
		        	}
		        }*/
		        
		        w.write(out);
	            out.close();
			
	}
		

}
