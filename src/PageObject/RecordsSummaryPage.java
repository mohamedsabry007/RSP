package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RecordsSummaryPage {
	
	private static WebElement element = null;

	public static WebElement RspRecordsAreCopied1(WebDriver driver)
	{
		element=driver.findElement(By.id("RspRecordsAreCopied1"));
		return element;	
	}

	public static WebElement RspRecordsAreCopied0(WebDriver driver)
	{
		element=driver.findElement(By.id("RspRecordsAreCopied0"));
		return element;	
	}

	public static WebElement txtAddtionalOrderRefNumbers(WebDriver driver)
	{
		element=driver.findElement(By.id("AddtionalOrderRefNumbers_b19f4d8a-2a2b-4f75-9db6-556b5bb6533e__RecordSummaryOrderReferenceNumber"));
		return element;	
	}

	public static WebElement txtLocationName(WebDriver driver)
	{
		element=driver.findElement(By.id("AddtionalOrderRefNumbers_b19f4d8a-2a2b-4f75-9db6-556b5bb6533e__LocationName"));
		return element;	
	}

	public static WebElement txtUserFirstName(WebDriver driver)
	{
		element=driver.findElement(By.id("UserFirstName"));
		return element;	
	}

	public static WebElement txtUserLastName(WebDriver driver)
	{
		element=driver.findElement(By.id("UserLastName"));
		return element;	
	}

	public static WebElement txtUserCompanyName(WebDriver driver)
	{
		element=driver.findElement(By.id("UserCompanyName"));
		return element;	
	}	
	
	public static  Select ddlUserJobTitle(WebDriver driver)
	{
		Select wannabeSelect = new Select (driver.findElement(By.id("ddlUserJobTitle")));
		return wannabeSelect;
	}	

	public static WebElement txtUserEmailAddress(WebDriver driver)
	{
		element=driver.findElement(By.id("UserEmailAddress"));
		return element;	
	}

	public static WebElement txtUserInfo_PhoneNumber(WebDriver driver)
	{
		element=driver.findElement(By.id("UserInfo_PhoneNumber"));
		return element;	
	}
	
	public static WebElement txtUserInfo_PhoneNumberExt(WebDriver driver)
	{
		element=driver.findElement(By.id("UserInfo_PhoneNumberExt"));
		return element;	
	}
	
	public static WebElement cbtnOrderShippingParty_Examiner_Adjustor(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderShippingParty_Examiner_Adjustor"));
		return element;	
	}
	
	public static WebElement cbtnOrderShippingParty_additional_distributions(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderShippingParty_additional_distributions"));
		return element;	
	}
	
	public static WebElement cbtnOrderShippingParty_Examiner_Adjustor_IsSummaryOnly(WebDriver driver)
	{
		element=driver.findElement(By.id("OrderShippingParty_Examiner_Adjustor_IsSummaryOnly"));
		return element;	
	}
	
	public static WebElement cbtnshippingPartyTypes_DistributionMethod(WebDriver driver)
	{
		element=driver.findElement(By.id("shippingPartyTypes_0c34e7a1-76cb-4aaf-b84a-c3125fd59d6e__DistributionMethod"));
		return element;	
	}
	
	public static WebElement CbxshippingPartyTypes_OrderShippingParty_Paper(WebDriver driver)
	{
		element=driver.findElement(By.id("shippingPartyTypes_0c34e7a1-76cb-4aaf-b84a-c3125fd59d6e__OrderShippingParty_Paper"));
		return element;	
	}
	
	public static WebElement txtshippingPartyTypes_NoOfPaperCopies(WebDriver driver)
	{
		element=driver.findElement(By.id("shippingPartyTypes_0c34e7a1-76cb-4aaf-b84a-c3125fd59d6e__NoOfPaperCopies"));
		return element;	
	}

	
	public static WebElement CbxshippingPartyTypes_OrderShippingParty_CD(WebDriver driver)
	{
		element=driver.findElement(By.id("shippingPartyTypes_0c34e7a1-76cb-4aaf-b84a-c3125fd59d6e__OrderShippingParty_CD"));
		return element;	
	}
	
	public static WebElement txtshippingPartyTypes_NoOfCDCopies(WebDriver driver)
	{
		element=driver.findElement(By.id("shippingPartyTypes_0c34e7a1-76cb-4aaf-b84a-c3125fd59d6e__NoOfCDCopies"));
		return element;	
	}
	
	public static WebElement BtnPlaceOrder(WebDriver driver) 
	{
		element = driver.findElement(By.xpath(".//*[@id='containerDiv']/div/button[1]"));
        return element;
	}
	
	public static WebElement BtnSaveLater(WebDriver driver) 
	{
		element = driver.findElement(By.className("SaveToCompleteLateBtn"));
        return element;
	}
	
}
