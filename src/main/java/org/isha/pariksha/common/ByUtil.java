/**
 * 
 */
package org.isha.pariksha.common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author prasanna
 *
 */
public class ByUtil {

	public static By radioButton(String text){
		return By.xpath("//tr[contains(.,'"+text+"')][//input[@type='radio']]");
		
		//td[contains(.,'"+text+"')]/preceding-sibling::td//input[@type='radio']]
	}
	
	public static By textBox(String labelText){
		return null;
	}
	
	public static By tableByColumns(String...strings){
		return null;
	}
}
