package createworkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public static void main(String[] args) throws IOException {
		File src=new File("C:\\Users\\Training_b6b.01.07\\Desktop\\Login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total no of rows is:" + rowcount);
		
		for(int i=1;i<=rowcount;i++)
		{
			String firstname=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("First Name is:"+firstname);
			
			String lastname=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("lastname is:"+lastname);
			
			String password=sheet.getRow(i).getCell(2).getStringCellValue();
			System.out.println("password is:"+password);
			
			String cnfmpwd=sheet.getRow(i).getCell(3).getStringCellValue();
			System.out.println("confirm password	 is:"+cnfmpwd);
			
		}
		
		wb.close();
	}

}