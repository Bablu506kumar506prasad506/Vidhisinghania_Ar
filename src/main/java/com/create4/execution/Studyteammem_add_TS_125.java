package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_125;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Studyteammem_add_TS_125  {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		//GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}


	@Test
	public void CRe4_565_566_567_568_569() throws Exception {

		TS_125 i1 = new TS_125();
		i1.CRe4_565_566_567_568_569();

	}

	@Test
	public void CRe4_575() throws Exception {

		TS_125 i1 = new TS_125();
		i1.CRe4_575();

	}

	@Test
	public void CRe4_576() throws Exception {

		TS_125 i1 = new TS_125();
		i1.CRe4_576();

	}

	@Test
	public void CRe4_577() throws Exception {

		TS_125 i1 = new TS_125();
		i1.CRe4_577();

	}

	@Test
	public void CRe4_580() throws Exception {

		TS_125 i1 = new TS_125();
		i1.CRe4_580();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
		

	}

}
