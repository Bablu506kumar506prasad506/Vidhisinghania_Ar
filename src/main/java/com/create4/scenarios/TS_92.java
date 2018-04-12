package com.create4.scenarios;

import java.io.FileInputStream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.methods.GlobalMethods;
import com.global.methods.GlobalWait;

import jxl.Sheet;
import jxl.Workbook;

//Check for contact us feature�functionality
public class TS_92 {

	public TS_92() {
		// this.driver=driver;
		// driver = GlobalMethods.driver;
		PageFactory.initElements(GlobalMethods.driver, this);
	}

GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(linkText = "KEM Institute & Hospitals")
	WebElement institute;

	@FindBy(linkText = "Contact Us")
	WebElement contactuslink;

	@FindBy(linkText = "Feedback")
	WebElement feedbacklink;

	@FindBy(css = "span.columm_elabel_text")
	WebElement tabularemail;

	@FindBy(xpath = "//th[2]/a/span[2]")
	WebElement tabularsubject;

	@FindBy(xpath = "//th[3]")
	WebElement tabularmessage;

	@FindBy(xpath = "//th[4]/span")
	WebElement tabularview;

	@FindBy(xpath = "//th[5]/span")
	WebElement tabularaction;

	@FindBy(xpath = "//td[4]/a/span")
	WebElement contactview;

	@FindBy(xpath = "//*[@id='contact_us_email']")
	WebElement contactemail;

	@FindBy(xpath = "//*[@id='contact_us_subject']")
	WebElement contactsubject;

	@FindBy(xpath = "//*[@id='contact_us_message']")
	WebElement contactmsg;

	@FindBy(id = "contact_us_send_copy")
	WebElement contactcopy;

	@FindBy(id = "contact_us_details_submit")
	WebElement contactbutton;

	@FindBy(xpath = "html/body/div[4]/div[1]/div[2]/div[1]/span/a")
	WebElement contactuslink1;

	@FindBy(id = "respond_contactus_details_submit")
	WebElement responsebutton;

	@FindBy(linkText = "Respond")
	WebElement repondlink;

	@FindBy(css = "p.error-msg")
	WebElement replyfieldalert;

	@FindBy(xpath = "//span/a")
	WebElement logoutt;

	@FindBy(css = "img")
	WebElement logo;

	@FindBy(id = "respond_contactus_reply_message")
	WebElement replyfield;

	@FindBy(xpath = "//p")
	WebElement responsemsg;

	// Check for Contact Us/Feedback link
	public void CRe4_735_to_746() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Meetings");

		String fieldemail = r1.getCell(2, 127).getContents();
		System.out.println(fieldemail);

		String feildsubject = r1.getCell(3, 127).getContents();

		String fieldmsg = r1.getCell(4, 127).getContents();
		
		Sheet r11 = wb.getSheet("Institute_Logins");
		String PI_Institute = r11.getCell(0, 2).getContents();
		WebElement institute_Link = GWait.Wait_GetElementByLinkText(PI_Institute);
		institute_Link.click();

		WebElement contactuslink= GWait.Wait_GetElementByLinkText("Contact Us");
		contactuslink.click();

		contactemail.sendKeys(fieldemail);
		contactsubject.sendKeys(feildsubject);
		contactmsg.sendKeys(fieldmsg);
		contactcopy.click();
		contactbutton.click();

		String response_reply_alert = r1.getCell(5, 127).getContents();

		String response_reply_value = r1.getCell(6, 127).getContents();

		String response_reply_msg = r1.getCell(7, 127).getContents();

		WebElement Logo_link= GWait.Wait_GetElementByCSS("img");
		Logo_link.click();
		GlobalMethods.Super_Login();
		WebElement tabularemail= GWait.Wait_GetElementByCSS("span.columm_elabel_text");
		tabularemail.getText();
		tabularsubject.getText();
		tabularmessage.getText();
		tabularview.getText();
		tabularaction.getText();
		WebElement contactview= GWait.Wait_GetElementByXpath("//td[4]/a/span");
		contactview.click();
		WebElement contactuslink1= GWait.Wait_GetElementByXpath("html/body/div[4]/div[1]/div[2]/div[1]/span/a");
		contactuslink1.click();
		WebElement repondlink= GWait.Wait_GetElementByLinkText("Respond");
		repondlink.click();
		WebElement responsebutton= GWait.Wait_GetElementById("respond_contactus_details_submit");
		responsebutton.click();
		WebElement replyfieldalert= GWait.Wait_GetElementByCSS("p.error-msg");
		String replyfieldalert_1 = replyfieldalert.getText();
		response_reply_alert.equalsIgnoreCase(replyfieldalert_1);
		System.out.println(replyfieldalert_1);
		WebElement replyfield= GWait.Wait_GetElementById("respond_contactus_reply_message");
		replyfield.sendKeys(response_reply_value);
		WebElement responsebutton1= GWait.Wait_GetElementById("respond_contactus_details_submit");
		responsebutton1.click();

		String responsemsg_1 = responsemsg.getText();
		response_reply_msg.equalsIgnoreCase(responsemsg_1);
		System.out.println(responsemsg_1);
		WebElement logoutt= GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
		WebElement Logo_link1= GWait.Wait_GetElementByCSS("img");
		Logo_link1.click();

	}
	
	public void CRe4_747_748() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Meetings");

		String fieldemail = r1.getCell(2, 129).getContents();
		System.out.println(fieldemail);

		String feildsubject = r1.getCell(3, 129).getContents();

		String fieldmsg = r1.getCell(4, 129).getContents();
		
		Sheet r11 = wb.getSheet("Institute_Logins");
		String PI_Institute = r11.getCell(0, 2).getContents();
		WebElement institute_Link = GWait.Wait_GetElementByLinkText(PI_Institute);
		institute_Link.click();

		WebElement contactuslink= GWait.Wait_GetElementByLinkText("Contact Us");
		contactuslink.click();

		System.out.println(fieldemail);
		contactemail.sendKeys(fieldemail);
		contactsubject.sendKeys(feildsubject);
		contactmsg.sendKeys(fieldmsg);
		contactcopy.click();
		contactbutton.click();
		Thread.sleep(6000);
		GlobalMethods.ContactUS("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin",
				"qualeetee112@gmail.com", "qa@123456");
		
		
	}

}
