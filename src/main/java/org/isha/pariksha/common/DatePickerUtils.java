/**
 * 
 */
package org.isha.pariksha.common;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author senthilprasad.c
 *
 */
public class DatePickerUtils {

	
	public static void selectDateInPMS(Date date,RemoteWebDriver driver){
	
		By datePickerDiv= By.id("ui-datepicker-div");
		By previousMonth = By.xpath(".//a[.='Prev']");
		By nextMonth = By.xpath(".//a[.='Prev']");
		By dateTableBody = By.xpath(".//table/tbody");
		
		Date today= new Date();
		int todayDate;
		
		
		
		
	}
}
