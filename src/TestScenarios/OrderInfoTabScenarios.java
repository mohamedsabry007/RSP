package TestScenarios;


import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import PageObject.WorkCompPage;

public class OrderInfoTabScenarios {
	

		public static void OrderInfo (WebDriver driver,int row,Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
						{	
						/*Thread.sleep(2000);*/
						String OrderSubTypeID = S.getCell(0, row).getContents();
									if (OrderSubTypeID.equalsIgnoreCase("1"))
									{
										//String SelectWCABSubpoena = "//input[contains(@id,'PageObject.Orders_WorkCompPage.RbtnOrderSubTypeID1') and contains(@value, 1)]";
										PageObject.WorkCompPage.RbtnOrderSubTypeID1(driver).click();
										String WCAB = S.getCell(1, row).getContents();
										WorkCompPage.txtOrderExtentionInfo_ADJWCABCaseNumber(driver).sendKeys(WCAB);		
									}
									else if (OrderSubTypeID.equalsIgnoreCase("2"))			
									{
										PageObject.WorkCompPage.RbtnOrderSubTypeID2(driver).click();
									}	
									else if (OrderSubTypeID.equalsIgnoreCase("3"))			
									{
										PageObject.WorkCompPage.RbtnOrderSubTypeID3(driver).click();
									}
									else if (OrderSubTypeID.equalsIgnoreCase("4"))			
									{
										String AddressTypeValue = S.getCell(2, row).getContents();
										if (AddressTypeValue.equalsIgnoreCase("1"))
										{
											PageObject.WorkCompPage.ClaimantAddress(driver).click();
											String address = S.getCell(3, row).getContents();
											WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToStreetAddress(driver).sendKeys(address);
											String ZipCode = S.getCell(4, row).getContents();
											WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToZipCode(driver).sendKeys(ZipCode);
											String City = S.getCell(5, row).getContents();
											WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToCity(driver).sendKeys(City);
											String State = S.getCell(6, row).getContents();
											WorkCompPage.DDLOrderExtentionInfo_SignedReleaseSendToStateId(driver).selectByVisibleText(State);
										}
										else if (AddressTypeValue.equalsIgnoreCase("2"))
										{
											PageObject.WorkCompPage.AppAttorneyAddress(driver).click();
											String address = S.getCell(3, row).getContents();
											WorkCompPage.ClaimantAddress(driver).sendKeys(address);
											String ZipCode = S.getCell(4, row).getContents();
											WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToZipCode(driver).sendKeys(ZipCode);
											String City = S.getCell(5, row).getContents();
											WorkCompPage.txtOrderExtentionInfo_SignedReleaseSendToCity(driver).sendKeys(City);
											String State = S.getCell(6, row).getContents();
											WorkCompPage.DDLOrderExtentionInfo_SignedReleaseSendToStateId(driver).selectByVisibleText(State);
										}
									}
						//////////////*************PersonalAppearanceSubpoena**********************////////////////////////
									String PersonalAppearanceSubpoenaValue = S.getCell(7, row).getContents();
									if (PersonalAppearanceSubpoenaValue.equalsIgnoreCase("true"))
										
									{
										PageObject.WorkCompPage.PersonalApperanceSubtrue(driver).click();
										String CourtName = S.getCell(8, row).getContents();
										WorkCompPage.txtNameOfCourt(driver).sendKeys(CourtName);
										String AppDate = S.getCell(9, row).getContents();
										WorkCompPage.txtAppearDate(driver).sendKeys(AppDate);
										String AppTime = S.getCell(10, row).getContents();
										WorkCompPage.txtAppearTime(driver).sendKeys(AppTime);
										String PresidingJudgeName = S.getCell(11, row).getContents();
										WorkCompPage.txtNameOfPresidingJudge(driver).sendKeys(PresidingJudgeName);
										
									}
									else if (PersonalAppearanceSubpoenaValue.equalsIgnoreCase("false"))
									{
										PageObject.WorkCompPage.PersonalApperanceSubfalse(driver).click();
									}
									//////////////*************WCABEDEXcheck**********************////////////////////////
									String WCABEDEXcheckValue = S.getCell(12, row).getContents(); 
									if (WCABEDEXcheckValue.equalsIgnoreCase("true"))
										
									{
										PageObject.WorkCompPage.WCABEDEXcheckYes(driver).click();
										String SSN = S.getCell(13, row).getContents();
										WorkCompPage.txtSSN(driver).sendKeys(SSN);
										
									}
									else if (WCABEDEXcheckValue.equalsIgnoreCase("false"))
									{
										PageObject.WorkCompPage.WCABEDEXcheckNo(driver).click();
									}
									
									//////////////*************Order Delivery Timeframe**********************////////////////////////
									String OrderDeliveryTimeframeValue = S.getCell(14, row).getContents();
									if (OrderDeliveryTimeframeValue.equalsIgnoreCase("1"))
									{
										PageObject.WorkCompPage.ODTAsap(driver).click();
									}
									else if(OrderDeliveryTimeframeValue.equalsIgnoreCase("2"))
									{
										PageObject.WorkCompPage.ODTRush(driver).click();
									}
									else if(OrderDeliveryTimeframeValue.equalsIgnoreCase("3"))
									{
										PageObject.WorkCompPage.ODTOther(driver).click();
										String Other = S.getCell(15, row).getContents();
										WorkCompPage.OrderExtentionInfo_RequestedDeliveryDate(driver).sendKeys(Other);
										
									}
									/*Thread.sleep(2000);*/
									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
