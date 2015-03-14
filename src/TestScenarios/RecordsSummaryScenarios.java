package TestScenarios;


import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import PageObject.RecordsSummaryPage;

public class RecordsSummaryScenarios {
	
	static String RspRecordsAreCopied;
	
	static String Name;

	
	
	//Sheet S;
	

		public static void LocationTab (WebDriver driver,int row,Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
					{					
								RspRecordsAreCopied =S.getCell(0, row).getContents();
								if(RspRecordsAreCopied.equalsIgnoreCase("No"))
								{
									RecordsSummaryPage.RspRecordsAreCopied0(driver).click();
								}
								else
								{
									RecordsSummaryPage.RspRecordsAreCopied1(driver).click();
									
									String OrderRefNo = S.getCell(1, row).getContents();
									String LocName = S.getCell(2, row).getContents();
									String FirstName = S.getCell(3, row).getContents();
									String LastName = S.getCell(4, row).getContents();
									String CompanyName = S.getCell(5, row).getContents();
									String JobTitle = S.getCell(6, row).getContents();
									String EmailAddress = S.getCell(7, row).getContents();
									String Phone = S.getCell(8, row).getContents();
									String Ext = S.getCell(9, row).getContents();
									String Examiner_Adjustor = S.getCell(10, row).getContents();
									String Additional_Distributions = S.getCell(11, row).getContents();
									
									
									RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(OrderRefNo);
									RecordsSummaryPage.txtLocationName(driver).sendKeys(LocName);
									RecordsSummaryPage.txtUserFirstName(driver).sendKeys(FirstName);
									RecordsSummaryPage.txtUserLastName(driver).sendKeys(LastName);
									RecordsSummaryPage.txtUserCompanyName(driver).sendKeys(CompanyName);
									RecordsSummaryPage.ddlUserJobTitle(driver).selectByVisibleText(JobTitle);
									RecordsSummaryPage.txtUserEmailAddress(driver).sendKeys(EmailAddress);
									RecordsSummaryPage.txtUserInfo_PhoneNumber(driver).sendKeys(Phone);
									RecordsSummaryPage.txtUserInfo_PhoneNumberExt(driver).sendKeys(Ext);
									
									if(Examiner_Adjustor.equalsIgnoreCase("1"))
									{
										RecordsSummaryPage.cbtnOrderShippingParty_Examiner_Adjustor(driver).click();
									}
									if(Additional_Distributions.equalsIgnoreCase("1"))
									{
										RecordsSummaryPage.cbtnOrderShippingParty_additional_distributions(driver).click();
										
										String Paper = S.getCell(12, row).getContents();
										String CD = S.getCell(13, row).getContents();
										String Number_Copies = S.getCell(14, row).getContents();
										String Name = S.getCell(15, row).getContents();
										String Bussiness_Name = S.getCell(16, row).getContents();
										String Street_Address = S.getCell(17, row).getContents();
										String Zip_Code = S.getCell(18, row).getContents();
										String City = S.getCell(19, row).getContents();
										String Phone_Number = S.getCell(20, row).getContents();
										String Add_Ext = S.getCell(21, row).getContents();
										String Fax = S.getCell(22, row).getContents();
										
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Paper);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(CD);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Number_Copies);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Name);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Bussiness_Name);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Street_Address);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Zip_Code);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(City);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Phone_Number);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Add_Ext);
										RecordsSummaryPage.txtAddtionalOrderRefNumbers(driver).sendKeys(Fax);
									}
								}
									Thread.sleep(2000);									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
					}
				}
		}
