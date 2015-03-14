package TestSteps;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.events.EventException;

import PageObject.CivilOrderPage;
import PageObject.DashboardPage;
import utility.url;

public class CivilOrderSteps 
{
	private WebDriver driver;
	int row = 2 ;
	

	@BeforeMethod
	public void setUp() throws EventException {
		  
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	@Test
	public void testCivilOrder()
	{
		try
		{
			
			driver.get(url.signinurl());
			
			FileInputStream fi = new FileInputStream("C:\\Users\\mmahran\\workspace\\RSPAutomationProject\\RSP.AcceptanceTest\\TestData - Orders_Work Comp_Validations Cases.xls");
			
			Workbook w = Workbook.getWorkbook(fi);
			
			Sheet S= w.getSheet(0);
			
			while( row<S.getRows())
			{	
		
				TestScenarios.SignIn.SigninMethod(S,driver, row);	
				DashboardPage.PlaceOrder(driver).click();
				DashboardPage.NewCivilOrder(driver).click();
				S= w.getSheet(7);
				TestScenarios.PlaintiffCaseInfoScenarios.AddApplicant(driver,row,S);
				CivilOrderPage.BtnClaimantProceedbutton(driver).click();
				Thread.sleep(2000);
				S= w.getSheet(3);
				TestScenarios.CarrierOrAttorneyTabScenarios.CarrierOrAttorney(driver, row, S);
				CivilOrderPage.BtnCivil_CarrierProceedbutton(driver).click();
				S= w.getSheet(4);
				TestScenarios.CivilOrderLocationsScenarios.LocationTab(driver, row, S);
				CivilOrderPage.BtnCivil_LocationsProceedbutton(driver).click();
				S= w.getSheet(5);
				TestScenarios.CivilOrderShipmentAndBillingScenarios.ShipmentBillingTab(driver, row, S);
				CivilOrderPage.BtnCivil_ShipmentProceedbutton(driver).click();
				S= w.getSheet(6);
				TestScenarios.AttachmentsScenarios.AttachmentsTab(driver, row, S);
				CivilOrderPage.BtnCivil_AttachmentsProceedbutton(driver).click();

				
				Thread.sleep(6000);
				CivilOrderPage.BtnPlaceOrder(driver).click();
				Thread.sleep(5000);
				
				AssertJUnit.assertEquals("Thank you! Your order has been successfully placed . ",driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div/div[2]/div/div/div/h4[1]")).getText());
			
				
				Thread.sleep(3000);
			}
			row++;
		}
	
		catch(Exception ex)
			{
			
			ex.getMessage();
		
			}
			finally
				{
				driver.close();
				driver.quit();
				}
			}

		}
