package org.isha.pariksha.common;

import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


/**
 * @author prasy
 * This class is used for methods to configure the selenium grid for execution
 *
 */
public class Grid {
	
	
public static RemoteWebDriver getDriver(){
	
	
	
	return null;
}

@Test

public void test() throws IOException{
	getCapablities();
}
public static Capabilities getCapablities() throws IOException{
//	RemoteWebDriver rm= new RemoteWebDriver(getCapablities());
	DesiredCapabilities desireCapb= DesiredCapabilities.chrome();
	
	
	String s= FirefoxDriver.BINARY;
	FirefoxProfile fp= new FirefoxProfile();
	return null;
}









}
