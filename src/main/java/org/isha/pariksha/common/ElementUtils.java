/**
 * 
 */
package org.isha.pariksha.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Clock;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author prasy
 *
 */
public class ElementUtils {

	
	

	public static WebElement getElement(By by, RemoteWebDriver driver){
		long timeOutInSeconds=Long.parseLong(System.getProperty("TimeOutInSeconds"));
		
		WebElement element = (new WebDriverWait(driver, timeOutInSeconds)).pollingEvery(300, TimeUnit.MILLISECONDS)
				  .until(ExpectedConditions.presenceOfElementLocated(by));
		
		return element;
	}
}
