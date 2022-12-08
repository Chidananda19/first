package POM_Scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Login_POM {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement UNTF;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement PWTF;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement LBTN;
	
	
	public Login_POM(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
	public void enterUN(String un)
	{
		UNTF.sendKeys(un);
		
	}
	public void enterPW(String pw) 
	{
		PWTF.sendKeys(pw);
		
	}
	
		
		

	public void clicklog()
	{
		LBTN.click();
	}
	
}

