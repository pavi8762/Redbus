package tests;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;

@Listeners(ListenerClass.class)
public class LoginTest extends Baseclass {
	
	XSSFWorkbook Workbook;
	XSSFSheet sheet1;
	
	@BeforeTest
	public void Fetchdata() throws IOException {
		FileInputStream fis = new FileInputStream("exceldata.xlsx");
		Workbook  = new XSSFWorkbook(fis);
		sheet1 = Workbook.getSheetAt(0);
		
		
		
		
	}
	
	@Test
	public void login() {
		
		LoginPage loginpage = new LoginPage(driver);
		String MobileNo = sheet1.getRow(0).getCell(0).getStringCellValue();
		loginpage.LogintoApp(MobileNo);
	
	
 
	}
}
