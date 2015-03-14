package TestScenarios;

import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import com.thoughtworks.selenium.webdriven.commands.IsTextPresent;


import static org.junit.Assert.*;
import PageObject.HomePage;
import PageObject.RegisterPage;

public class RegisterScenarios {
	static String  firstname;

	static String Lastname;

	static String Companyname;

	static String JobTitle;

	static String EmailAddress;
	
	static String PhoneNumber;
	
	static String Ext;
	
	static String FaxNumber;

	static String UserName;

	static String Password;

	static String ConfirmPassword;
	
	Sheet s;
	
	static int row=2;
	
	public static void registerMethod(Sheet S, WebDriver driver, int row) throws InterruptedException, BiffException, IOException
	
			{
		
		
		HomePage.btnRegister(driver).click();
		
		/*Thread.sleep(1000);*/
		
		assertEquals(" Registration Form Sign Up Today",driver.findElement(By.xpath(".//*[@id='page-title']/div/h1")).getText());
				
		firstname=S.getCell(1, row).getContents();
		RegisterPage.txtFirstName(driver).sendKeys(firstname);
		
		
		Lastname=S.getCell(2, row).getContents();
		RegisterPage.insertLastName(driver).sendKeys(Lastname);
		
		
		Companyname=S.getCell(3,row).getContents();
		RegisterPage.insertCompanyName(driver).sendKeys(Companyname);
		
		
		JobTitle=S.getCell(4,row).getContents();
		RegisterPage.selectJobTitle(driver).selectByVisibleText(JobTitle);
		
		/*Thread.sleep(2000);*/
		EmailAddress=S.getCell(5,row).getContents();
		RegisterPage.insertEmailAddress(driver).sendKeys(EmailAddress);
		
		Thread.sleep(2000);
		PhoneNumber=S.getCell(6,row).getContents();
		RegisterPage.insertPhoneNumber(driver).sendKeys(PhoneNumber);

		Ext=S.getCell(7,row).getContents();
		RegisterPage.insertExt(driver).sendKeys(Ext);
		
		FaxNumber=S.getCell(8,row).getContents();
		RegisterPage.insertFaxNumber(driver).sendKeys(FaxNumber);
		
		UserName=S.getCell(9,row).getContents();
		RegisterPage.insertUserName(driver).sendKeys(UserName);
		
		Password=S.getCell(10,row).getContents();
		RegisterPage.insertPassword(driver).sendKeys(Password);
		
		ConfirmPassword=S.getCell(11,row).getContents();
		RegisterPage.confirmPassword(driver).sendKeys(ConfirmPassword);
		
		RegisterPage.AcceptsTerms(driver).click();
		
		RegisterPage.register(driver).click();
		Thread.sleep(2000);
		try {
			boolean Registration_succeeded = true;
			if(firstname.equals(""))
			{
				assertEquals("The First Name field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[1]/div[1]/div/span[2]/span")).getText());
				Registration_succeeded = false;
			}
			if(Lastname.equals(""))
			{
				assertEquals("The Last Name field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[1]/div[2]/div/span[2]/span")).getText());
				Registration_succeeded = false;
			}
			if(Companyname.equals(""))
			{
				assertEquals("The Company Name field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[1]/div[3]/div/span[2]/span")).getText());
				Registration_succeeded = false;
			}
			if(JobTitle.equals(""))
			{
				assertEquals("The Job Title field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[1]/div[4]/div/span[2]/span")).getText());
				Registration_succeeded = false;
			}
			if(EmailAddress.equals(""))
			{
				//assertEquals("The Email Address field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[1]/div[6]/div/span[2]/span")).isDisplayed());
				assertEquals("The Email Address field is required.",driver.findElement(By.cssSelector(".field-validation-error")).getText());
				Registration_succeeded = false;
			}
			if(UserName.equals(""))
			{
				assertEquals("The Username field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[3]/div[2]/div/input")).getText());
				Registration_succeeded = false;
			}
			if(Password.equals(""))
			{
				assertEquals("The Password field is required.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[3]/div[3]/div[1]/input")).getText());
				Registration_succeeded = false;
			}
			if(ConfirmPassword.equals(""))
			{
				assertEquals("The password and confirmation password do not match.",driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[3]/div[4]/div/span[2]/span")).getText());
				Registration_succeeded = false;
			}
			if(!Password.equals(ConfirmPassword))
			{
				Thread.sleep(2000);
			    assertFalse(driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/form/div[2]/div/div[1]/fieldset[3]/div[4]/div/span[2]/span")).isDisplayed());
		
				Registration_succeeded = false;
			}
			if (Registration_succeeded)
			{		
				RegisterPage.placeorderOnline(driver).click();	
				RegisterPage.SelectWorkComp(driver).click();
				RegisterPage.Continue(driver).click();		
				assertEquals("Work Comp Order Form",driver.findElement(By.xpath(".//*[@id='page-title']/div/h1")).getText());
			}
			
			
		} 
		catch (Exception e) 
		{
			throw new IllegalStateException("Exception in Validations in RegisterScenarios.java file", e);
		}
		Thread.sleep(1000);
		row++;
	}
	
	
}
