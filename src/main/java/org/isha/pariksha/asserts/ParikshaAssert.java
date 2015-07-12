/**
 * 
 */
package org.isha.pariksha.asserts;

import org.eclipse.jetty.util.log.LoggerLog;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

/**
 * @author prasanna
 *
 */
public class ParikshaAssert {
	
	
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
	
	
	public static void assertTextInElement(WebElement element , String exectedValue){
	
		
		String elementTxt= element.getText();
		if(element.getTagName().equalsIgnoreCase("input"))
			elementTxt=element.getAttribute("value");
		Assert.assertEquals(elementTxt, exectedValue);
		System.out.println("Found text " + exectedValue + " in element");
		
	}
}
