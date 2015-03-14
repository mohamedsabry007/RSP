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






import PageObject.DashboardPage;
import PageObject.WorkCompPage;
import utility.url;


public class WorkCompOrderSteps 
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
	public void testWorkCompOrder()
	{
		try
		{
			
			driver.get(url.signinurl());
			
			FileInputStream fi = new FileInputStream("C:\\Users\\mmahran\\workspace\\RSPAutomationProject\\RSP.AcceptanceTest\\TestData - Orders_Work Comp2.xls");
			
			Workbook w = Workbook.getWorkbook(fi);
			
			Sheet S= w.getSheet(0);
			
			while( row<S.getRows())
			{	
		
				TestScenarios.SignIn.SigninMethod(S,driver, row);	
				DashboardPage.PlaceOrder(driver).click();
				DashboardPage.NewWorkCompOrder(driver).click();
				S= w.getSheet(1);
				if(TestScenarios.ClaimantCaseInfoScenarios.AddApplicant(driver,row,S))
				{
	
					S= w.getSheet(2);
					TestScenarios.OrderInfoTabScenarios.OrderInfo(driver, row, S);
					WorkCompPage.BtnOrderInfoProceedbutton(driver).click();
					Thread.sleep(2000);
					S= w.getSheet(3);
					int attorney_councel_Flag = TestScenarios.CarrierOrAttorneyTabScenarios.CarrierOrAttorney(driver, row, S);
					WorkCompPage.BtnCarrierProceedbutton(driver).click();
					S= w.getSheet(4);
					TestScenarios.WorkCompLocationsScenarios.LocationTab(driver, row, S);
					WorkCompPage.BtnLocationProceedbutton(driver).click();
					S= w.getSheet(5);
					TestScenarios.WorkCompShipmentAndBillingScenarios.ShipmentBillingTab(driver, row, S, attorney_councel_Flag);
					WorkCompPage.BtnShipmentProceedbutton(driver).click();
					S= w.getSheet(6);
					TestScenarios.AttachmentsScenarios.AttachmentsTab(driver, row, S);
					WorkCompPage.BtnAttachmentsProceedbutton(driver).click();
					Thread.sleep(5000);
					WorkCompPage.BtnPlaceOrder(driver).click();
					Thread.sleep(3000);
					AssertJUnit.assertEquals("Thank you! Your order has been successfully placed . ",driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div/div[2]/div/div/div/h4[1]")).getText());
					
				}
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
