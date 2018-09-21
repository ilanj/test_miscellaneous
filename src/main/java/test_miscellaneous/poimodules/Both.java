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


public class Both {

	
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
			FileOutputStream out = new FileOutputStream(new File("./write.xlsx"));
			 XSSFWorkbook workbook = new XSSFWorkbook();
			 
		        // Create a blank sheet
			// XSSFCellStyle redStyle, greenStyle;
			 int r=0,c=0;
		        XSSFSheet sheet = workbook.createSheet("student Details");
		        Row row;
		        Cell cell;
		        String key="auxo";
		        for(r=0;r<10;r++)
		        {
		        	 row = sheet.createRow(r);
		        	for(c=0;c<10;c++)
		        	{
		        		
		     	        cell = row.createCell(c);
		        		cell.setCellValue(key);
		        	}
		        	sheet.shiftRows(r,sheet.getLastRowNum(),1,true,false);

		        }
		        Sheet sheet1=w.getSheetAt(0);
		       // XSSFSheet sheet1 = workbook.createSheet("address");
		        for(r=0;r<10;r++)
		        {
		        	 row = sheet1.createRow(r);
		        	for(c=0;c<10;c++)
		        	{
		        	    cell = row.createCell(c);
		        		cell.setCellValue("gfgf");
		        	}
		        }
		        Sheet sheet2=w.getSheetAt(0);
		        Row row2;
		        row2=sheet2.getRow(1);
		        cell=row2.createCell(1);
		        cell.setCellValue("  ");
		        workbook.write(out);
	            out.close();
			
	}
		

}
