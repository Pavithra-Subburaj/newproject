package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DSAlgoSignInPom extends DSAlgoCommonPom {
	public DSAlgoSignInPom(WebDriver driver) {
		super(driver);	
	} 

	@FindBy(xpath="//input[@id='id_username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btn_login;
	
	@FindBy(xpath="//a[text()='Register!']")
	WebElement lnk_Register;
	
			
	public void setUserName(String name) {
		txt_username.sendKeys(name);
	}
	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}
	public void clickLogin() {
		btn_login.click();
	}
	public String getTitle()
	{
		return driver.getTitle();
	}
}
