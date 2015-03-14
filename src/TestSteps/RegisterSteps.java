package TestSteps;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;


//import static org.junit.Assert.assertEquals;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.events.EventException;

import PageObject.HomePage;
//import PageObject.RegisterPage;
import TestScenarios.RegisterScenarios;
import utility.url;
public class RegisterSteps 
{	private WebDriver driver;
	int row = 2 ;

	@BeforeMethod
	public void setUp() throws EventException {  
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	@Test
	public void testRegister()
	{
		try
		{			
			driver.get(url.baseurl());			
			FileInputStream fi = new FileInputStream("C:\\Users\\mmahran\\workspace\\RSPAutomationProject\\RSP.AcceptanceTest\\TestData_Validations.xls");			
			Workbook w = Workbook.getWorkbook(fi);			
			Sheet S=w.getSheet(0);
			while( row<S.getRows() )
			{
				RegisterScenarios.registerMethod(S,driver, row++);

				HomePage.btnRegister(driver).click();
			}	
		}
		catch(Exception ex)
			{
				ex.getMessage();
			}
			finally
				{	driver.close();
					driver.quit();
				}
			}
		}
