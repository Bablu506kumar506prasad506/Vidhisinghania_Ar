package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_178;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Dev_substat_msdecsn_TS_178 {
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
	public void CRe4_1392() throws Exception {

		TS_178 i1 = new TS_178();
		i1.CRe4_1392();

	}

	@Test
	public void CRe4_1397() throws Exception {

		TS_178 i1 = new TS_178();
		i1.CRe4_1397();

	}

	@Test
	public void CRe4_1402() throws Exception {

		TS_178 i1 = new TS_178();
		i1.CRe4_1402();

	}

	@Test
	public void CRe4_1407() throws Exception {

		TS_178 i1 = new TS_178();
		i1.CRe4_1407();

	}

	@Test
	public void CRe4_1412() throws Exception {

		TS_178 i1 = new TS_178();
		i1.CRe4_1412();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}

}
