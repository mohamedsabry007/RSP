package TestScenarios;


import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
//import PageObject.Orders_WorkCompPage;

import PageObject.CivilOrderPage;

public class CivilOrderShipmentAndBillingScenarios {

	static String ExaminerOrAdjuster;
	static String AdditionalDist;
	static String ShipmentTypeID;
	static String BillingInfoID ;

		public static void ShipmentBillingTab (WebDriver driver,int row, Sheet S)  throws InterruptedException, BiffException, IOException
				{

					
					try
						{			

						ExaminerOrAdjuster = S.getCell(0, row).getContents();
						AdditionalDist  = S.getCell(1, row).getContents();	
						
									if (ExaminerOrAdjuster.equalsIgnoreCase("1"))
									{
							
										CivilOrderPage.ExaminerAdjustor(driver).click();
										String ExOrAdjShipType = S.getCell(2, row).getContents();
										Thread.sleep(2000);
										if (ExOrAdjShipType.equalsIgnoreCase("0"))
										{
											CivilOrderPage.DistributionMethodDownloadonly(driver).click();
											
										}
										else if (ExOrAdjShipType.equalsIgnoreCase("1"))
										{
											CivilOrderPage.DistributionMethodbyMail(driver).click();
											String ExPaper = S.getCell(3, row).getContents();
											String ExCD = S.getCell(5, row).getContents();
											if (ExPaper.equalsIgnoreCase("1"))
											{
												CivilOrderPage.shippingPaper(driver).click();
												String ExPaperCopyNo = S.getCell(4, row).getContents();
												CivilOrderPage.txtshippingNoOfPaperCopies(driver).sendKeys(ExPaperCopyNo);
											}
											if (ExCD.equalsIgnoreCase("1"))
											{
												CivilOrderPage.shippingCD(driver).click();
												String ExCDCopyNo = S.getCell(6, row).getContents();
												CivilOrderPage.txtshippingNoOfCDCopies(driver).sendKeys(ExCDCopyNo);
											}
										}
									}	
									if (AdditionalDist.equalsIgnoreCase("1"))
									{
										CivilOrderPage.additionaldistributions(driver).click();
										String AddPaper = S.getCell(7, row).getContents();
										String AddCD = S.getCell(9, row).getContents();
										if (AddPaper.equalsIgnoreCase("1"))
										{
											CivilOrderPage.Paper(driver).click();
											
											String AddPaperCopyNo = S.getCell(8, row).getContents();
											CivilOrderPage.txtNoOfPaperCopies(driver).sendKeys(AddPaperCopyNo);
										}
										if (AddCD.equalsIgnoreCase("1"))
										{
											CivilOrderPage.CD(driver).click();
											String AddCDCopyNo = S.getCell(10, row).getContents();
											CivilOrderPage.txtNoOfCDCopies(driver).sendKeys(AddCDCopyNo);
										}
										String AddName = S.getCell(11, row).getContents();
										CivilOrderPage.txtname(driver).sendKeys(AddName);
										String AddBusinessName = S.getCell(12, row).getContents();
										CivilOrderPage.txtbusinessname(driver).sendKeys(AddBusinessName);
										String AddStreetAddress = S.getCell(13, row).getContents();
										CivilOrderPage.txtstreetaddress(driver).sendKeys(AddStreetAddress);
										String AddZipCode = S.getCell(14, row).getContents();
										CivilOrderPage.txtShipmentZipCode(driver).sendKeys(AddZipCode);
										String AddCity = S.getCell(15, row).getContents();
										CivilOrderPage.txtShipmentCity(driver).sendKeys(AddCity);
										String AddState = S.getCell(16, row).getContents();
										CivilOrderPage.DDLShipmentstate(driver).selectByVisibleText(AddState);
										String AddPhoneNumber = S.getCell(17, row).getContents();
										CivilOrderPage.txtShipmentphonenumber(driver).sendKeys(AddPhoneNumber);
										String AddExt = S.getCell(18, row).getContents();
										CivilOrderPage.txtShipmentExt(driver).sendKeys(AddExt);
										String AddFaxNumber = S.getCell(19, row).getContents();
										CivilOrderPage.txtShipmentfaxnumber(driver).sendKeys(AddFaxNumber);
										
									}
									Thread.sleep(2000);
								BillingInfoID = S.getCell(20, row).getContents();	
								if (BillingInfoID.equalsIgnoreCase("1"))
								{
									CivilOrderPage.SendInvoiceYes(driver).click();
								}
								else if (BillingInfoID.equalsIgnoreCase("0"))
								{
									CivilOrderPage.SendInvoiceNo(driver).click();
									String BillingFirstName = S.getCell(21, row).getContents();
									CivilOrderPage.txtfirstname(driver).sendKeys(BillingFirstName);
									String BillingLastName = S.getCell(22, row).getContents();
									CivilOrderPage.txtLastname(driver).sendKeys(BillingLastName);
									String BillingCompanyName = S.getCell(23, row).getContents();
									CivilOrderPage.txtcompanyname(driver).sendKeys(BillingCompanyName);
									String BillingPhoneNumber = S.getCell(24, row).getContents();
									CivilOrderPage.txtbillingphonenumber(driver).sendKeys(BillingPhoneNumber);
									String BillingExt = S.getCell(25, row).getContents();
									CivilOrderPage.txtbillingExt(driver).sendKeys(BillingExt);
									String BillingFaxNumber = S.getCell(26, row).getContents();
									CivilOrderPage.txtbillingfaxnumber(driver).sendKeys(BillingFaxNumber);
									String BillingEmailAddress = S.getCell(27, row).getContents();
									CivilOrderPage.txtEmailAddress(driver).sendKeys(BillingEmailAddress);
									String BillingStreetAddress = S.getCell(28, row).getContents();
									CivilOrderPage.txtbillingstreetaddress(driver).sendKeys(BillingStreetAddress);
									String BillingZipCode = S.getCell(29, row).getContents();
									CivilOrderPage.txtbillingZipCode(driver).sendKeys(BillingZipCode);
									String BillingCity = S.getCell(30, row).getContents();
									CivilOrderPage.txtbillingCity(driver).sendKeys(BillingCity);
									String BillingState = S.getCell(31, row).getContents();
									CivilOrderPage.DLLbillingstate(driver).selectByVisibleText(BillingState);												
								}
									
						}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
