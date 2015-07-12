package org.isha.test.pms.indent;

import org.isha.pariksha.common.Grid;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ValidateDefaultDate {

	RemoteWebDriver driver=null;
	
	@Test
	public void verifyDefaultDate(){
		
		driver=Grid.getDriver();
		
	}
}
