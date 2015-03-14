package TestScenarios;


import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;

import PageObject.WorkCompPage;

public class AttachmentsScenarios {
	static String FilePath;
	
		public static void AttachmentsTab (WebDriver driver,int row, Sheet S)  throws InterruptedException, BiffException, IOException
				{
					try
					{

					FilePath=S.getCell(0, row).getContents();
					WorkCompPage.Btnfileupload(driver).sendKeys(FilePath);
									
					/*Thread.sleep(2000);*/
					}
			
					catch(Exception ex)
					{
						ex.getMessage();
		  
					}
	  
				}
		}
