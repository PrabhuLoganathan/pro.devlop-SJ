package org.isha.pariksha.common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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
	
	
public static RemoteWebDriver getDriver() throws MalformedURLException{
	
	DesiredCapabilities desireCapbFF= DesiredCapabilities.firefox();
	
	RemoteWebDriver rm = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),  
	            desireCapbFF);
	return rm;
}



void startHub(){
//	g
//	GridHubConfiguration config = new GridHubConfiguration()
//    config.setHost("localhost")
//    config.setTimeout(60000000)
//    Hub hub = new Hub(config)
//    hub.start()
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
	DesiredCapabilities desireCapbFF= DesiredCapabilities.firefox();
	RemoteWebDriver rm = new RemoteWebDriver(desireCapbFF);
	
	return null	;
}









}
