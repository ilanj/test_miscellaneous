package test_miscellaneous;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Text2String {


	public static void main(String[] args) throws IOException {
		//
		//
		FileInputStream f=new FileInputStream("./data.xlsx");
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		int rowcount=s.getLastRowNum();
		int colcount=s.getRow(0).getLastCellNum();
		int i,j;
		
		for(j=0;j<=rowcount;j++)
		{
			String fileName=s.getRow(j).getCell(0).getStringCellValue();
			File file = new File("./Mandrake/"+fileName);
			String string = FileUtils.readFileToString(file);
			System.out.println(string);
			
		}
		
		
	}
}