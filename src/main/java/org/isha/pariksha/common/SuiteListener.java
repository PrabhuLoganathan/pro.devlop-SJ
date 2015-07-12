package org.isha.pariksha.common;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		suite.getParameter("browser");
		suite.getParameter("version");
		suite.getParameter("seleniumHost");
		suite.getParameter("seleniumPort");

	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
