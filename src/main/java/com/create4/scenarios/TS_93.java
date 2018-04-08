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

//Check for feedback feature functionality
public class TS_93 {

	public TS_93() {
		// this.driver=driver;
		// driver = GlobalMethods.driver;
		PageFactory.initElements(GlobalMethods.driver, this);
	}
GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(linkText = "KEM Institute & Hospitals")
	WebElement institute;

	@FindBy(linkText = "Feedback")
	WebElement feedbacklink;

	@FindBy(xpath = "html/body/div[4]/div[1]/div[2]/div[4]/h3")
	WebElement pageheading;

	@FindBy(xpath = "//form[@id='feedback']/div/label")
	WebElement feedbackname;

	@FindBy(xpath = "//form[@id='feedback']/div[2]/label")
	WebElement feedbackemail;

	@FindBy(xpath = "//form[@id='feedback']/div[3]/label")
	WebElement feedbacknumber;

	@FindBy(xpath = "//form[@id='feedback']/div[4]/label")
	WebElement feedbackdescription;

	@FindBy(id = "feedback_details_submit")
	WebElement submit_button;

	@FindBy(linkText = "Contact Us / Feedback")
	WebElement cnctfeedmenulink;

	@FindBy(linkText = "Feedback List")
	WebElement feedbackleftlink;

	@FindBy(css = "span.columm_elabel_text")
	WebElement tabularname;

	@FindBy(xpath = "//th[2]/a/span[2]")
	WebElement tabularemail;

	@FindBy(xpath = "//th[3]/a/span[2]")
	WebElement tabularcntctnumber;

	@FindBy(xpath = "//th[4]/span")
	WebElement tabulardescription;

	@FindBy(xpath = "//th[5]/span")
	WebElement tabularview;

	@FindBy(xpath = "//th[6]/span")
	WebElement tabularaction;

	@FindBy(xpath = "//td[5]/a/span")
	WebElement feedview;

	@FindBy(xpath = "//p")
	WebElement valuedetail1;

	@FindBy(xpath = "//div[2]/div[4]/div/div[2]/div[2]")
	WebElement valuedetail2;

	@FindBy(xpath = "//div[4]/div/div[3]")
	WebElement valuedetail3;

	@FindBy(xpath = "//div[4]/div[2]/p")
	WebElement valuedetail4;

	@FindBy(xpath = "//div[5]/div[2]/p")
	WebElement valuedetail5;

	@FindBy(xpath = "//span/a")
	WebElement logoutt;

	@FindBy(css = "img")
	WebElement logo;

	@FindBy(xpath = "//*[@id='feedback_name']")
	WebElement formfeedname;

	@FindBy(xpath = "//*[@id='feedback_email']")
	WebElement formfeedemail;

	@FindBy(xpath = "//*[@id='feedback_number']")
	WebElement formfeednumber;

	@FindBy(xpath = "//*[@id='feedback_description']")
	WebElement formfeeddescription;

	@FindBy(linkText = "Respond")
	WebElement repondlink;

	@FindBy(xpath = "//form[@id='respond_feedback']/div/label")
	WebElement responseemail;

	@FindBy(xpath = "//form[@id='respond_feedback']/div[2]/label")
	WebElement responsedesc;

	@FindBy(xpath = "//form[@id='respond_feedback']/div[3]/label")
	WebElement responsereply;

	@FindBy(id = "respond_feedback_details_submit")
	WebElement responsebutton;

	@FindBy(css = "p.error-msg")
	WebElement replyfieldalert;

	@FindBy(xpath = "//p")
	WebElement responsemsg;

	@FindBy(id = "respond_feedback_new_description")
	WebElement replyfield;

	@FindBy(xpath = "//div/div/div/div/div/p")
	WebElement feedbackacknowledge;

	
	// Check for Feedback list features
	public void CRe4_749_to_759() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Meetings");
		
		String formname = r1.getCell(2, 131).getContents();
		String formemail = r1.getCell(3, 131).getContents();
		String formnumber = r1.getCell(4, 131).getContents();
		String formdescription = r1.getCell(5, 131).getContents();

		String namefield = r1.getCell(6, 131).getContents();
		String emailfield = r1.getCell(7, 131).getContents();
		String contactfield = r1.getCell(8, 131).getContents();
		String descriptionfield = r1.getCell(9, 131).getContents();
		String submitfield = r1.getCell(10, 131).getContents();
		String tabname = r1.getCell(11, 131).getContents();
		String tabemail = r1.getCell(12, 131).getContents();
		String tabcnctnumber = r1.getCell(13, 131).getContents();
		String tabview = r1.getCell(14, 131).getContents();
		String tabaction = r1.getCell(15, 131).getContents();
		String tabviewheading = r1.getCell(16, 131).getContents();
		String responsenew = r1.getCell(17, 131).getContents();
		String respondlinkheading = r1.getCell(18, 131).getContents();
		String response_email = r1.getCell(19, 131).getContents();
		String response_desc = r1.getCell(20, 131).getContents();
		String response_reply = r1.getCell(21, 131).getContents();
		String response_button = r1.getCell(22, 131).getContents();
		String response_reply_alert = r1.getCell(23, 131).getContents();
		String response_reply_value = r1.getCell(24, 131).getContents();
		String response_reply_msg = r1.getCell(25, 131).getContents();
		
		//KEM Institute & Hospitals
		WebElement institute_Link= GWait.Wait_GetElementByLinkText("Rainbow Hospitals");
		institute_Link.click();
		WebElement feedbacklink= GWait.Wait_GetElementByLinkText("Feedback");
		feedbacklink.click();
		
		formfeedname.sendKeys(formname);
		formfeedemail.sendKeys(formemail);
		formfeednumber.sendKeys(formnumber);
		formfeeddescription.sendKeys(formdescription);
		WebElement submit_button= GWait.Wait_GetElementById("feedback_details_submit");
		submit_button.click();

		WebElement feedbackacknowledge= GWait.Wait_GetElementByXpath("//div/div/div/div/div/p");
		String feedbackacknowledge_1 = feedbackacknowledge.getText();
		System.out.println(feedbackacknowledge_1);

		String feedbackname_1a = feedbackname.getText();
		namefield.equalsIgnoreCase(feedbackname_1a);
		System.out.println(feedbackname_1a);

		String feedbackemail_1a = feedbackemail.getText();
		emailfield.equalsIgnoreCase(feedbackemail_1a);
		System.out.println(feedbackemail_1a);

		String feedbacknumber_1a = feedbacknumber.getText();
		contactfield.equalsIgnoreCase(feedbacknumber_1a);
		System.out.println(feedbacknumber_1a);

		String feedbackdescription_1a = feedbackdescription.getText();
		descriptionfield.equalsIgnoreCase(feedbackdescription_1a);
		System.out.println(feedbackdescription_1a);
		WebElement submit_button1= GWait.Wait_GetElementById("feedback_details_submit");
		String submit_button_1a = submit_button1.getAttribute("value");
		submitfield.equalsIgnoreCase(submit_button_1a);
		System.out.println(submit_button_1a);
		WebElement logo= GWait.Wait_GetElementByCSS("img");
		logo.click();
		
		GlobalMethods.Super_Login();
		
		WebElement cnctfeedmenulink= GWait.Wait_GetElementByLinkText("Contact Us / Feedback");
		cnctfeedmenulink.click();

		WebElement feedbackleftlink= GWait.Wait_GetElementByLinkText("Feedback List");
		feedbackleftlink.click();

		String tabularname_1a = tabularname.getText();
		tabname.equalsIgnoreCase(tabularname_1a);
		System.out.println(tabularname_1a);

		String tabularemail_1a = tabularemail.getText();
		tabemail.equalsIgnoreCase(tabularemail_1a);
		System.out.println(tabularemail_1a);

		String tabularcntctnumber_1a = tabularcntctnumber.getText();
		tabcnctnumber.equalsIgnoreCase(tabularcntctnumber_1a);
		System.out.println(tabularcntctnumber_1a);

		String tabulardescription_1a = tabulardescription.getText();
		System.out.println(tabulardescription_1a);

		String tabularview_1a = tabularview.getText();
		tabview.equalsIgnoreCase(tabularview_1a);
		System.out.println(tabularview_1a);

		String tabularaction_1a = tabularaction.getText();
		tabaction.equalsIgnoreCase(tabularaction_1a);
		System.out.println(tabularaction_1a);

		WebElement feedbackleftlink1= GWait.Wait_GetElementByLinkText("Feedback List");
		feedbackleftlink1.click();
		WebElement feedview= GWait.Wait_GetElementByXpath("//td[5]/a/span");
		feedview.click();

		String pageheading_1 = pageheading.getText();
		tabviewheading.equalsIgnoreCase(pageheading_1);
		System.out.println(pageheading_1);

		String valuedetail1_1 = valuedetail1.getText();
		formname.equalsIgnoreCase(valuedetail1_1);
		System.out.println(valuedetail1_1);

		String valuedetail2_1 = valuedetail2.getText();
		formemail.equalsIgnoreCase(valuedetail2_1);
		System.out.println(valuedetail2_1);

		String valuedetail3_1 = valuedetail3.getText();
		formnumber.equalsIgnoreCase(valuedetail3_1);
		System.out.println(valuedetail3_1);

		String valuedetail4_1 = valuedetail4.getText();
		formdescription.equalsIgnoreCase(valuedetail4_1);
		System.out.println(valuedetail4_1);

		String valuedetail5_1 = valuedetail5.getText();
		responsenew.equalsIgnoreCase(valuedetail5_1);
		System.out.println(valuedetail5_1);

		WebElement cnctfeedmenulink1= GWait.Wait_GetElementByLinkText("Contact Us / Feedback");
		cnctfeedmenulink1.click();
		WebElement feedbackleftlink2= GWait.Wait_GetElementByLinkText("Feedback List");
		feedbackleftlink2.click();
		WebElement repondlink= GWait.Wait_GetElementByLinkText("Respond");
		repondlink.click();

		String pageheading_2 = pageheading.getText();
		respondlinkheading.equalsIgnoreCase(pageheading_2);
		System.out.println(pageheading_2);

		String responseemail_1 = responseemail.getText();
		response_email.equalsIgnoreCase(responseemail_1);
		System.out.println(responseemail_1);

		String responsedesc_1 = responsedesc.getText();
		response_desc.equalsIgnoreCase(responsedesc_1);
		System.out.println(responsedesc_1);

		String responsereply_1 = responsereply.getText();
		response_reply.equalsIgnoreCase(responsereply_1);
		System.out.println(responsereply_1);

		String responsebutton_1 = responsebutton.getAttribute("value");
		response_button.equalsIgnoreCase(responsebutton_1);
		System.out.println(responsebutton_1);
		WebElement responsebutton= GWait.Wait_GetElementById("respond_feedback_details_submit");
		responsebutton.click();
		WebElement replyfieldalert= GWait.Wait_GetElementByCSS("p.error-msg");
		String replyfieldalert_1 = replyfieldalert.getText();
		response_reply_alert.equalsIgnoreCase(replyfieldalert_1);
		System.out.println(replyfieldalert_1);

		replyfield.sendKeys(response_reply_value);
		WebElement responsebutton1= GWait.Wait_GetElementById("respond_feedback_details_submit");
		responsebutton1.click();

		String responsemsg_1 = responsemsg.getText();
		response_reply_msg.equalsIgnoreCase(responsemsg_1);
		System.out.println(responsemsg_1);
		
		WebElement logoutt= GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
		WebElement logo1= GWait.Wait_GetElementByCSS("img");
		logo1.click();

	}
	
	public void CRe4_760_761() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Meetings");

		String formname = r1.getCell(2, 133).getContents();
		String formemail = r1.getCell(3, 133).getContents();
		String formnumber = r1.getCell(4, 133).getContents();
		String formdescription = r1.getCell(5, 133).getContents();

		WebElement institute_Link= GWait.Wait_GetElementByLinkText("Rainbow Hospitals");
		institute_Link.click();
		WebElement feedbacklink= GWait.Wait_GetElementByLinkText("Feedback");
		feedbacklink.click();
		
		formfeedname.sendKeys(formname);
		formfeedemail.sendKeys(formemail);
		formfeednumber.sendKeys(formnumber);
		formfeeddescription.sendKeys(formdescription);
		WebElement submit_button= GWait.Wait_GetElementById("feedback_details_submit");
		submit_button.click();
		
		Thread.sleep(6000);
		GlobalMethods.feedback("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin",
				"qualeetee112@gmail.com", "qa@123456");
	}
	

}
