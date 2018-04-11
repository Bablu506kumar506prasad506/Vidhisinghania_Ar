package com.create4.execution;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_161;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Terminationsub_flow_TS_161 {

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
	public void CRe4_2294_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2294_T();

	}

	@Test
	public void CRe4_2295_2296_2297_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2295_2296_2297_T();

	}

	@Test
	public void CRe4_2303_2304_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2303_2304_T();

	}

	@Test
	public void CRe4_2305_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2305_T();

	}

	@Test
	public void CRe4_2309_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2309_T();

	}

	@Test
	public void CRe4_2310_2336_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2310_2336_T();

	}
	
	@Test
	public void CRe4_2333_2334_2335_T() throws Exception {

		TS_161 i1 = new TS_161();
		i1.CRe4_2333_2334_2335_T();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
