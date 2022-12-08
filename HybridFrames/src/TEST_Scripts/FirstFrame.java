package TEST_Scripts;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import GENERIC_Scripts.Base_test;
import GENERIC_Scripts.SingleReadDataGeneric;
import POM_Scripts.Login_POM;

@Test
public class FirstFrame extends Base_test{
	
public void logfb() throws InterruptedException, EncryptedDocumentException, IOException
{
	String un = SingleReadDataGeneric.getdata("Sheet1",0,0);
	String pw = SingleReadDataGeneric.getdata("Sheet1",1,0);
	
	
	
	Login_POM p = new Login_POM(driver);
	Thread.sleep(2000);
	
	
    p.enterUN(un);
  	Thread.sleep(2000);
	p.enterPW(pw);
	Thread.sleep(2000);
	
 Assert.fail();
p.clicklog();
	


}


}
