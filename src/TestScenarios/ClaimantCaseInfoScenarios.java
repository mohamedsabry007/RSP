package TestScenarios;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.WorkCompPage;

public class ClaimantCaseInfoScenarios {
	

		public static boolean AddApplicant(WebDriver driver,int row, Sheet S)  throws InterruptedException, BiffException, IOException
				{
			boolean Claimant_Case_Info = true;		
			try
						{

									String FirstName = S.getCell(0, row).getContents();
									WorkCompPage.txtApplicantFirstName(driver).sendKeys(FirstName);
					
									String txtMiddleName = S.getCell(1, row).getContents();
									WorkCompPage.txtApplicantMiddleName(driver).sendKeys(txtMiddleName);
					
									String txtLastName = S.getCell(2, row).getContents();
									WorkCompPage.txtApplicantLastName(driver).sendKeys(txtLastName);
				
									String CBIsSSNUnknown = S.getCell(3, row).getContents();
									String txtApplicantSSN = S.getCell(4, row).getContents();
									if(CBIsSSNUnknown.equalsIgnoreCase("True"))
									{
										WorkCompPage.CBIsSSNUnknown(driver).click();
									}
									else
									{
										
										WorkCompPage.txtApplicantSSN(driver).sendKeys(txtApplicantSSN);
									}
									
									String CBIsDOBUnknown = S.getCell(5, row).getContents();
									String txtApplicantDOB = S.getCell(6, row).getContents();
									if(CBIsDOBUnknown.equalsIgnoreCase("True"))
									{
										WorkCompPage.CBIsDOBUnknown(driver).click();
								
									}
									else
									{
									
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
									
									String txtClaimFileNo = S.getCell(13, row).getContents();
									WorkCompPage.txtClaimFileNo(driver).sendKeys(txtClaimFileNo);
									
									String txtDateOfInjury = S.getCell(14, row).getContents();
									WorkCompPage.txtDateOfInjury(driver).sendKeys(txtDateOfInjury);
									
									String txtAdditionalInfo = S.getCell(15, row).getContents();
									WorkCompPage.txtAdditionalInfo(driver).sendKeys(txtAdditionalInfo);
									

									/*Thread.sleep(2000);*/
									
									WorkCompPage.BtnClaimantProceedbutton(driver).click();
									
									
									if(FirstName.equals(""))
									{
										assertEquals("The First Name field is required.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
										Claimant_Case_Info = false;
									}
									if(txtLastName.equals(""))
									{
										assertEquals("The Last Name field is required.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
										Claimant_Case_Info = false;
									}
									if(!CBIsSSNUnknown.equals("True") && txtApplicantSSN.equals(""))
									{
										assertEquals("The field SSN is invalid.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
										Claimant_Case_Info = false;
									}
									if(!CBIsDOBUnknown.equals("True") && txtApplicantDOB.equals(""))
									{
										assertEquals("The field Date of Birth is invalid.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
										Claimant_Case_Info = false;
									}
									if(txtEmployerDefendent.equals(""))
									{
										assertEquals("The field Employer/Defendant is invalid.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
										Claimant_Case_Info = false;
									}
									if(txtClaimFileNo.equals(""))
									{
										assertEquals("The Claim File No. field is required.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
										Claimant_Case_Info = false;
									}
									
									

									
								}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
			return Claimant_Case_Info;
				}
		}
