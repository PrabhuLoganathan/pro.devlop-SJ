package org.isha.test.pms.indent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterClass;

//import org.isha.test.pms.indent.*;
import org.isha.util.pms.indent.PmsIndentConst;

public class Validationcheck {
	
RemoteWebDriver driver=null;
	
	@Test
	public void validatemobile() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		
		String checking="Intercom number should have 4 to 8 digit !!!";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(PmsIndentConst.Pmsindenturl);
		// for maxmim no 4-8
		WebElement intercom=  driver.findElement(By.xpath("//label[contains(text(),'Intercom No:')]/following-sibling::input"));
		intercom.sendKeys("12345678900");
		String intercom_checking=driver.findElement(By.xpath("//label[contains(text(),'Intercom No:')]/following-sibling::span")).getText();
		if(intercom_checking.equals(checking))
		
				{
			System.out.println("message is displaying");
			
				}
		else
		{
			System.out.println("wrong");
			
			System.out.println("hai");
			
		}
		
		

		
}
	
	
}

