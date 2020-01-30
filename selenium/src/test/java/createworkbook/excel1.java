package createworkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel1 {

	public static void main(String[] args) throws IOException {
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", chromepath);
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("http://demoaut.com/");
		  
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
			System.out.println("confirm password is:"+cnfmpwd);
			
		
		
		driver.findElement(By.linkText("Home")).click();
		String expectedTitle="Welcome: Mercury Tours";
		String actualTitle=driver.getTitle();
		
	
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("same");
			sheet.getRow(0).createCell(3).setCellValue("Results");
			sheet.getRow(i).createCell(3).setCellValue("Pass:Home page");
		}
		else
		{
			System.out.println("not in home");
			sheet.getRow(i).createCell(3).setCellValue("Fail: not in homepage");
		}
		FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\Training_b6b.01.07\\\\Desktop\\\\Login.xlsx");
		wb.write(fout);
		
	

	}
		wb.close();
		driver.close();
	}
}


