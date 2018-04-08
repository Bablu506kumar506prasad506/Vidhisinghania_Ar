package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_93;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Feedback_fnctnlty_TS_93 {
	
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
	public void CRe4_749_to_759() throws Exception {

		TS_93 Links = new TS_93();

		Links.CRe4_749_to_759();

	}
	
	@Test
	public void CRe4_760_761() throws Exception {

		TS_93 Links = new TS_93();

		Links.CRe4_760_761();

	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
