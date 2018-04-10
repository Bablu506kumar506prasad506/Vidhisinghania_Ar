package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_189;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Saesub_flow_TS_189 {

	@BeforeMethod
	public void beforeMethod() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1, 0).getContents();
		String FirefoxBrowser = r1.getCell(1, 1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_2294_S() throws Exception {

		TS_189 i1 = new TS_189();
		i1.CRe4_2294_S();

	}

	@Test
	public void CRe4_2295_2296_2297_S() throws Exception {

		TS_189 i1 = new TS_189();
		i1.CRe4_2295_2296_2297_S();

	}

	@Test
	public void CRe4_2303_2304_S() throws Exception {

		TS_189 i1 = new TS_189();
		i1.CRe4_2303_2304_S();

	}

	@Test
	public void CRe4_2305_S() throws Exception {

		TS_189 i1 = new TS_189();
		i1.CRe4_2305_S();

	}

	@Test
	public void CRe4_2309_S() throws Exception {

		TS_189 i1 = new TS_189();
		i1.CRe4_2309_S();

	}

	@Test
	public void CRe4_2310_2336_S() throws Exception {

		TS_189 i1 = new TS_189();
		i1.CRe4_2310_2336_S();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
