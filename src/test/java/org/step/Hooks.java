package org.step;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pojo.Pojo;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before(order=3)
	public void beforeScenario() {

		
		
		System.out.println("before screenshot");
		
		
		
	}
	
  	@After(order=3)
  	public void afterScreenshot(Scenario s) throws IOException {
  		
  	if (s.isFailed()) {
		
  		TakesScreenshot ts=(TakesScreenshot)driver;
  		
  		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
  		
  		s.embed(screenshotAs, "image/png");
	}
  		
	}

}