package org.isha.test.pms.indent;
import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.isha.pariksha.asserts.ParikshaAssert;
import org.isha.pariksha.common.Grid;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.isha.pariksha.common.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import org.testng.annotations.AfterClass;

//import org.isha.test.pms.indent.*;
import org.isha.util.pms.indent.PmsIndentConst;


public class CreateRequest {
RemoteWebDriver driver=null;
	
	@Test
	public void Createrequestindent() throws Exception{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(PmsIndentConst.Pmsindenturl);

	Select entity_drpdwn=new Select(driver.findElement(By.xpath("//label[contains(text(),'Entity')]/following-sibling::select")));
		
	entity_drpdwn.selectByVisibleText("Isha Foundation");
		
		WebElement intercom=  driver.findElement(By.xpath("//label[contains(text(),'Intercom No:')]/following-sibling::input"));
		intercom.sendKeys("1234");
		
		
		WebElement emailid=  driver.findElement(By.xpath("//label[contains(text(),'Email ID:')]/following-sibling::input"));
		emailid.sendKeys("c.senthilprasad@gmail.com");
		
		Select depart_new=new Select(driver.findElement(By.xpath("//label[contains(text(),'Department:')]/following-sibling::select")));
		depart_new.selectByVisibleText("IT Department");
				
		
		WebElement name_req=  driver.findElement(By.xpath("//label[contains(text(),'Requestor Name:')]/following-sibling::input"));
		name_req.sendKeys("senthil");
		
		
		WebElement mobile_no=  driver.findElement(By.xpath("//label[contains(text(),'Mobile No:')]/following-sibling::input"));
		mobile_no.sendKeys("9940285219");
		
		WebElement prodect_neme=driver.findElement(By.id("custom-templates"));
		//
		prodect_neme.sendKeys("MotoG");
		Thread.sleep(5000);
		WebElement prodect_select=  driver.findElement(By.xpath("//label[contains(text(),'Item')]/following-sibling::select"));
		prodect_select.click();
		Thread.sleep(5000);
		
		//Select prod_selct=new Select(driver.findElement(By.id("custom-templates")));
		//prod_selct.selectByVisibleText("MotoG");
		
		WebElement band_name=driver.findElement(By.xpath("//*[@id='itemtable']/tbody/tr/td[3]/div/div[1]/div[2]/input"));
		
		band_name.sendKeys("Xpress");
		
		
		
		
	}
}
