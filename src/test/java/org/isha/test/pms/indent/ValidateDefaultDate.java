package org.isha.test.pms.indent;

import org.isha.pariksha.common.Grid;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.isha.pariksha.common.ElementUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;

//import org.isha.test.pms.indent.*;
import org.isha.util.pms.indent.PmsIndentConst;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ValidateDefaultDate {

	RemoteWebDriver driver=null;
	
	@Test
	public void verifyDefaultDate(){
		
		//driver=Grid.getDriver();
		//driver=Grid.getDriver();
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get(PmsIndentConst.Pmsindenturl);
				//String dateval=ElementUtils.getElement(By.xpath(xpathExpression), (RemoteWebDriver)driver).getText();
				//String dateval=driver.findElement(By.id("datepicker")
				//System.out.println(dateval);
				
				
				 Date todaydate = new Date( );
				 
				 SimpleDateFormat dateFrm= new SimpleDateFormat("yyyy/mm/dd");
				 
				 String systemdate = dateFrm.format(todaydate);
				 System.out.println(systemdate);
				 
				String xpath="//label[conatins(text(),'Date:"+systemdate+"')]";
				String dateval=ElementUtils.getElement(By.xpath(xpath), (RemoteWebDriver)driver).getText();
		
				System.out.println("Today date is"+dateval );
			
				 
				 
				 
				
			}
			
			@AfterClass
			public void tearDown(){
//				driver.quit();
//				driver= null;
			}
		
	}

