package pom;

import org.openqa.selenium.WebDriver;

public class DSAlgoRegistrationPom extends DSAlgoCommonPom {

	
	public DSAlgoRegistrationPom(WebDriver driver) {
		super(driver);
		
	}
	public String findTitle()
	{
		return driver.getTitle();
	}
}
