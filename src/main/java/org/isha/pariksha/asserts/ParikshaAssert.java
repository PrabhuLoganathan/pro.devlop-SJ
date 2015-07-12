/**
 * 
 */
package org.isha.pariksha.asserts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * @author prasanna
 *
 */
public class ParikshaAssert {
	
	
	private static RemoteWebDriver driver;

	public static void assertSelected(WebElement element){
		if(element.isSelected())
			Reporter.log(element.getText() + " Element is selected");
		else 
			throw new AssertionError(element + " Element is not selected");
			
	}
	
	public static void assertDisplayed(WebElement element){
		if(element.isDisplayed())
			Reporter.log(element.getText() + " Element is displayed");
		else 
			throw new AssertionError(element + " Element is not displayed");
	}
	
	
	public static void assertTextInElement(WebElement element , String exectedValue) throws Exception{
	
		
		String elementTxt= element.getText();
		if(element.getTagName().equalsIgnoreCase("input"))
			elementTxt=element.getAttribute("value");
		Assert.assertEquals(elementTxt, exectedValue);
		System.out.println("Found text " + exectedValue + " in element");
		
		
	}
	
	public static void assertTextsInPageSource(RemoteWebDriver driver, String[] strings) throws Exception{
		String pageSrc= driver.getPageSource();
		for(String s: strings){
			if(! pageSrc.contains(s)){
				throw new Exception(s +"text not found in page");
				
			}
			else
				System.out.println(s+" is present in the page");
		}
		
		
		
	}
	
	
}
