package TestScenarios;


import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import PageObject.WorkCompPage;

public class PlaintiffCaseInfoScenarios {
	

		public static void AddApplicant(WebDriver driver,int row, Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
						{

									String FirstName = S.getCell(0, row).getContents();
									WorkCompPage.txtApplicantFirstName(driver).sendKeys(FirstName);
					
									String txtMiddleName = S.getCell(1, row).getContents();
									WorkCompPage.txtApplicantMiddleName(driver).sendKeys(txtMiddleName);
					
									String txtLastName = S.getCell(2, row).getContents();
									WorkCompPage.txtApplicantLastName(driver).sendKeys(txtLastName);
				
									String CBIsSSNUnknown = S.getCell(3, row).getContents();
									if(CBIsSSNUnknown.equalsIgnoreCase("True"))
									{
										WorkCompPage.CBIsSSNUnknown(driver).click();
								
									}
									else
									{
										String txtApplicantSSN = S.getCell(4, row).getContents();
										WorkCompPage.txtApplicantSSN(driver).sendKeys(txtApplicantSSN);
									}
									
									String CBIsDOBUnknown = S.getCell(5, row).getContents();
									if(CBIsDOBUnknown.equalsIgnoreCase("True"))
									{
										WorkCompPage.CBIsDOBUnknown(driver).click();
								
									}
									else
									{
										String txtApplicantDOB = S.getCell(6, row).getContents();
										WorkCompPage.txtApplicantDOB(driver).sendKeys(txtApplicantDOB);
									}	
									
									String txtApplicantOtherAliases = S.getCell(7, row).getContents();
									WorkCompPage.txtApplicantOtherAliases(driver).sendKeys(txtApplicantOtherAliases);
									
									String txtApplicantInfo_StreetAddress = S.getCell(8, row).getContents();
									WorkCompPage.txtApplicantInfo_StreetAddress(driver).sendKeys(txtApplicantInfo_StreetAddress);
									
									String txtApplicantInfo_ZipCode = S.getCell(9, row).getContents();
									WorkCompPage.txtApplicantInfo_ZipCode(driver).sendKeys(txtApplicantInfo_ZipCode);
									
									String txtApplicantInfo_City = S.getCell(10, row).getContents();
									WorkCompPage.txtApplicantInfo_City(driver).sendKeys(txtApplicantInfo_City);
								
									String DDLApplicantInfo_StateID = S.getCell(11, row).getContents();
									WorkCompPage.DDLApplicantInfo_StateID(driver).selectByVisibleText(DDLApplicantInfo_StateID);
									
									String txtEmployerDefendent = S.getCell(12, row).getContents();
									WorkCompPage.txtEmployerDefendent(driver).sendKeys(txtEmployerDefendent);
									/////////////
									String txtCaseNumber = S.getCell(13, row).getContents();
									WorkCompPage.txtCaseNumber(driver).sendKeys(txtCaseNumber);
									
									////////////
									String txtClaimFileNo = S.getCell(14, row).getContents();
									WorkCompPage.txtClaimFileNo(driver).sendKeys(txtClaimFileNo);
									
									String txtDateOfInjury = S.getCell(15, row).getContents();
									WorkCompPage.txtDateOfInjury(driver).sendKeys(txtDateOfInjury);
									
									String txtAdditionalInfo = S.getCell(16, row).getContents();
									WorkCompPage.txtAdditionalInfo(driver).sendKeys(txtAdditionalInfo);
									

									Thread.sleep(2000);
									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
