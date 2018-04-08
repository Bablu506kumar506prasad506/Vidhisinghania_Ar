package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_92;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class CntctUs_fnctnlty_TS_92 {
	
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_735_to_746() throws Exception {

		TS_92 Links = new TS_92();

		Links.CRe4_735_to_746();

	}
	
	@Test
	public void CRe4_747_748() throws Exception {

		TS_92 Links = new TS_92();

		Links.CRe4_747_748();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
