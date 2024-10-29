package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DSAlgoGetStartedPom extends DSAlgoCommonPom{
	public DSAlgoGetStartedPom(WebDriver driver) {
		super(driver);
		
	}


	@FindBy(xpath="//a[@href='/home']/button[text()='Get Started']")
	WebElement main_button;
	
	@FindBy(xpath="//*[text()='You are at the right place']")
	WebElement main_msg;
	
	@FindBy(xpath="//*[text()='Preparing for the Interviews']")
	WebElement main_title;
	

	public void clickGetStarted() {
		main_button.click();
	}
	
	public String getTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	public String main_msg()
	{
		return main_msg.getText();
		
	}
	
}
