package org.isha.test.pms.indent;

//import org.isha.pariksha.common.Grid;
import org.isha.pariksha.asserts.ParikshaAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ValidationForRequiredFields 
{	
	RemoteWebDriver driver=null;
	@Test
	public void indentpage() throws Exception
	{
		String required="Required !!!";
//		driver=Grid.getDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://192.168.138.253/purchase/prf.html");
		
		//Save the indent page 
		WebElement save_btn=driver.findElement(By.linkText("Save"));
		save_btn.click();
		
		//entity field  
		String entity_drpdwn=driver.findElement(By.xpath("//label[contains(text(),'Entity:')]/following-sibling::span")).getText();
		if(entity_drpdwn.equals(required))
		{
			System.out.println("Validation for entity present" );
		}
		else
			throw new Exception("Validation for entity not present");
			
		//emailid field 
		WebElement emaild = driver.findElement(By.xpath("//label[contains(text(),'Email ID:')]/following-sibling::span"));		
		ParikshaAssert.assertTextInElement(emaild,"Invalid !!!");
		
		//Departmnet field 
		WebElement dept = driver.findElement(By.xpath("//label[contains(text(),'Department:')]/following-sibling::span"));		
		ParikshaAssert.assertTextInElement(dept, required);
		
		//Requestor name field 
		WebElement reqno = driver.findElement(By.xpath("//label[contains(text(),'Requestor Name:')]/following-sibling::span"));		
		ParikshaAssert.assertTextInElement(reqno, required);
		
		//mobile num field 
		WebElement mobileno = driver.findElement(By.xpath("//label[contains(text(),'Mobile No:')]/following-sibling::span"));		
		ParikshaAssert.assertTextInElement(mobileno, required);
		
		//item field 
		WebElement productrequired = driver.findElement(By.id("custom-templates"));	
		//String[] s1 ={"Warning!","Product Required !!! Hint : To add a Product click [+] Button."};
		ParikshaAssert.assertTextsInPageSource((RemoteWebDriver)driver, "Warning!","Product Required !!! Hint : To add a Product click [+] Button.");
		

		
	}
}
