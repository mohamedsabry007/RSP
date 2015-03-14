package TestScenarios;

import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;
import PageObject.LoginPage;

public class SignIn {

	static String username;

	static String password;
	
	Sheet s;
	
	public static void SigninMethod(Sheet S, WebDriver driver, int row) throws InterruptedException, BiffException, IOException
	
			{
		
		assertEquals("Secured Sign In",driver.findElement(By.xpath("/html/body/div[1]/section/div[1]/div[2]/div/div/div[2]/div/h3")).getText());
		
		
		username=S.getCell(0, row).getContents();
		LoginPage.txt_UserName(driver).sendKeys(username);
		
		
		password=S.getCell(1, row).getContents();
		LoginPage.txt_Password(driver).sendKeys(password);
		
		LoginPage.btn_Signin(driver).click();
		
			
	
	}
	
	
}
