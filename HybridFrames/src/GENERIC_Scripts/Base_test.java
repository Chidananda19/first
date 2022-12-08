package GENERIC_Scripts;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements frameworks {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(gkey, gvalue);
		driver=new FirefoxDriver();
		driver.get(url);
		}
	
	
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			genericscreenshot.getphoto(driver);
			
		}
		
		driver.close();
	}
}
