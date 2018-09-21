package test_miscellaneous.poimodules;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//this program just reads-----------------------------------------------------------------------------------------------------
//rowcount will always be n-1 from actual n rows
public class Rnw {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("./data.xlsx");
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		int rowcount=s.getLastRowNum();
		rowcount=rowcount+1;
		int colcount=s.getRow(0).getLastCellNum();
		System.out.println("row count="+rowcount+"\n column count="+colcount);
		int i,j;
		for(i=0;i<colcount;i++)
		{
		for(j=0;j<=rowcount;j++)
		{
			//Cell c=s.getRow(j).getCell(i);
			//either directly use the below line or the 2 above and below lines
			//String key=s.getRow(j).getCell(i).getStringCellValue();
			//String key=c.getStringCellValue();
			//System.out.print(key);
			String key=s.getRow(j).getCell(i).getStringCellValue();
			System.out.print(key);
		}
		System.out.println();
		}
		FileOutputStream out = new FileOutputStream(new File("write.xlsx"));
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 Sheet sheet1=w.getSheetAt(1);
		 
		
		

	}

}
