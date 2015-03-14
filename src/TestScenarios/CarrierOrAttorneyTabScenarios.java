package TestScenarios;


import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import PageObject.WorkCompPage;

public class CarrierOrAttorneyTabScenarios {
	
	static String ExaminerOrAdjustor;
	
	static String  firstname;

	static String Lastname;

	static String Companyname;
	
	static String PhoneNumber;

	static String Ext;
	
	static String FaxNumber;
	
	static String EmailAddress;

	static String StreetAddress;

	static String ZipCode;
	
	static String City;
	
	static String State;
	
	static String IsDefenseAttorneyAssigned;
	
	static String IsApplicantAttorneyAssigned;

	//Sheet s;
	
	
	
	public  static int CarrierOrAttorney(WebDriver driver,int row, Sheet S) throws InterruptedException, BiffException, IOException
	
			{
		
		//////////////*************Insurance Carrier Information**********************////////////////////////

		ExaminerOrAdjustor=S.getCell(0, row).getContents();
		WorkCompPage.DDLExistingExaminer(driver).selectByVisibleText(ExaminerOrAdjustor);
		
		firstname=S.getCell(1, row).getContents();
		WorkCompPage.txtExaminerFirstName(driver).sendKeys(firstname);
		
		
		Lastname=S.getCell(2, row).getContents();
		WorkCompPage.txtExaminerLastName(driver).sendKeys(Lastname);
		
		
		Companyname=S.getCell(3,row).getContents();
		WorkCompPage.txtExaminerCompanyName(driver).sendKeys(Companyname);
		
		
		PhoneNumber=S.getCell(4,row).getContents();
		WorkCompPage.txtExaminerPhoneNumber(driver).sendKeys(PhoneNumber);
		
		Ext=S.getCell(5,row).getContents();
		WorkCompPage.txtExaminerPhoneNumberExt(driver).sendKeys(Ext);
		
		FaxNumber=S.getCell(6,row).getContents();
		WorkCompPage.txtExaminerFaxNumber(driver).sendKeys(FaxNumber);
		
		Thread.sleep(2000);
		EmailAddress=S.getCell(7,row).getContents();
		WorkCompPage.txtExaminerEmailAddress(driver).sendKeys(EmailAddress);
		
		StreetAddress=S.getCell(8,row).getContents();
		WorkCompPage.txtExaminerStreetAddress(driver).sendKeys(StreetAddress);
		
		ZipCode=S.getCell(9,row).getContents();
		WorkCompPage.txtExaminerZipCode(driver).sendKeys(ZipCode);
		
		City=S.getCell(10,row).getContents();
		WorkCompPage.txtExaminerCity(driver).sendKeys(City);
		
		State=S.getCell(11, row).getContents();
		WorkCompPage.DDLExaminerCompanyInfo_StateId(driver).selectByVisibleText(State);
		
		
		////////////*************Defense Attorney Information**********************////////////////////////
		
		IsDefenseAttorneyAssigned = S.getCell(12, row).getContents(); 
		if (IsDefenseAttorneyAssigned.equalsIgnoreCase("true"))
			
		{
			PageObject.WorkCompPage.yes_IsDefenseAttorneyAssigned(driver).click();
			String DefenseAttorneyName = S.getCell(13, row).getContents();
			WorkCompPage.DDLExistingDefeneseAttorney(driver).selectByVisibleText(DefenseAttorneyName);
			String DefenseAttorneyFirstName = S.getCell(14, row).getContents();
			WorkCompPage.txtDefenseAttorneyFirstName(driver).sendKeys(DefenseAttorneyFirstName);
			String DefenseAttorneyLastName = S.getCell(15, row).getContents();
			WorkCompPage.txtDefenseAttorneyLastName(driver).sendKeys(DefenseAttorneyLastName);
			String DefenseAttorneyCompanyName = S.getCell(16, row).getContents();
			WorkCompPage.txtDefenseAttorneyCompanyName(driver).sendKeys(DefenseAttorneyCompanyName);
			String DefenseAttorneyPhoneNumber = S.getCell(17, row).getContents();
			WorkCompPage.txtDefenseAttorneyPhoneNumber(driver).sendKeys(DefenseAttorneyPhoneNumber);
			String DefenseAttorneyPhoneNumberExt = S.getCell(18, row).getContents();
			WorkCompPage.txtDefenseAttorneyPhoneNumberExt(driver).sendKeys(DefenseAttorneyPhoneNumberExt);
			String DefenseAttorneyFaxNumber = S.getCell(19, row).getContents();
			WorkCompPage.txtDefenseAttorneyFaxNumber(driver).sendKeys(DefenseAttorneyFaxNumber);
			String DefenseAttorneyEmailAddress = S.getCell(20, row).getContents();
			WorkCompPage.txtDefenseAttorneyEmailAddress(driver).sendKeys(DefenseAttorneyEmailAddress);
			String DefenseAttorneyStreetAddress = S.getCell(21, row).getContents();
			WorkCompPage.txtDefenseAttorneyStreetAddress(driver).sendKeys(DefenseAttorneyStreetAddress);
			String DefenseAttorneyZipCode = S.getCell(22, row).getContents();
			WorkCompPage.txtDefenseAttorneyZipCode(driver).sendKeys(DefenseAttorneyZipCode);
			String DefenseAttorneyCity = S.getCell(23, row).getContents();
			WorkCompPage.txtDefenseAttorneyCity(driver).sendKeys(DefenseAttorneyCity);
			String DefenseAttorneyCompanyInfo_StateId = S.getCell(24, row).getContents();
			WorkCompPage.txtDefenseAttorneyCompanyInfo_StateId(driver).selectByVisibleText(DefenseAttorneyCompanyInfo_StateId);
			
		}
		else
		{
			PageObject.WorkCompPage.no_IsDefenseAttorneyAssigned(driver).click();
		}
		
		////////////*************Applicant Attorney Information**********************////////////////////////
		
		IsApplicantAttorneyAssigned = S.getCell(25, row).getContents(); 
		if (IsApplicantAttorneyAssigned.equalsIgnoreCase("true"))
			
		{
			PageObject.WorkCompPage.yes_IsApplicantAttorneyAssigned(driver).click();
			String DefenseAttorneyName = S.getCell(26, row).getContents();
			WorkCompPage.DDLExistingDefeneseAttorney(driver).selectByVisibleText(DefenseAttorneyName);
			String ApplicantAttorneyFirstName = S.getCell(27, row).getContents();
			WorkCompPage.txtApplicantAttorneyFirstName(driver).sendKeys(ApplicantAttorneyFirstName);
			String ApplicantAttorneyLastName = S.getCell(28, row).getContents();
			WorkCompPage.txtApplicantAttorneyLastName(driver).sendKeys(ApplicantAttorneyLastName);
			String ApplicantAttorneyCompanyName = S.getCell(29, row).getContents();
			WorkCompPage.txtApplicantAttorneyCompanyName(driver).sendKeys(ApplicantAttorneyCompanyName);
			String ApplicantAttorneyPhoneNumber = S.getCell(30, row).getContents();
			WorkCompPage.txtApplicantAttorneyPhoneNumber(driver).sendKeys(ApplicantAttorneyPhoneNumber);
			String ApplicantAttorneyPhoneNumberExt = S.getCell(31, row).getContents();
			WorkCompPage.txtApplicantAttorneyPhoneNumberExt(driver).sendKeys(ApplicantAttorneyPhoneNumberExt);
			String ApplicantAttorneyFaxNumber = S.getCell(32, row).getContents();
			WorkCompPage.txtApplicantAttorneyFaxNumber(driver).sendKeys(ApplicantAttorneyFaxNumber);
			String ApplicantAttorneyEmailAddress = S.getCell(33, row).getContents();
			WorkCompPage.txtApplicantAttorneyEmailAddress(driver).sendKeys(ApplicantAttorneyEmailAddress);
			String ApplicantAttorneyStreetAddress = S.getCell(34, row).getContents();
			WorkCompPage.txtApplicantAttorneyStreetAddress(driver).sendKeys(ApplicantAttorneyStreetAddress);
			String ApplicantAttorneyZipCode = S.getCell(35, row).getContents();
			WorkCompPage.txtApplicantAttorneyZipCode(driver).sendKeys(ApplicantAttorneyZipCode);
			String ApplicantAttorneyCity = S.getCell(36, row).getContents();
			WorkCompPage.txtApplicantAttorneyCity(driver).sendKeys(ApplicantAttorneyCity);
			String ApplicantAttorneyCompanyInfo_StateId = S.getCell(37, row).getContents();
			WorkCompPage.DDLApplicantAttorneyCompanyInfo_StateId(driver).selectByVisibleText(ApplicantAttorneyCompanyInfo_StateId);
			
		}
		else
		{
			PageObject.WorkCompPage.no_IsApplicantAttorneyAssigned(driver).click();
		}
		
		Thread.sleep(2000);
		
		return 0;
	}

	
}
