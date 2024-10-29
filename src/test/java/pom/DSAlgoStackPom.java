package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DSAlgoStackPom extends DSAlgoCommonPom {

	
	public DSAlgoStackPom(WebDriver driver) {
		super(driver);
		
	}
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	@FindBy(xpath="//h4[@class='bg-secondary text-white' and text()='Stack']")
	WebElement page_title;
	@FindBy(xpath="//a[@href='operations-in-stack']")
	WebElement Operations_in_Stack_lnk;
	@FindBy(xpath="//a[@href='implementation']")
	WebElement Implementation_lnk;
	@FindBy(xpath="//a[@href='stack-applications']")
	WebElement Applications_lnk;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement Practice_Questions_lnk;
	
	public String gettile_page()
	{
		return page_title.getText();
	}
	public void click_Operations_in_stack()
	{
		Operations_in_Stack_lnk.click();
	}
	public void click_implementation()
	{
		Implementation_lnk.click();
	}
	public void click_applications()
	{
		Applications_lnk.click();
	}
	public void click_Practice_Questions()
	{
		Practice_Questions_lnk.click();
	}
	
//Operarations_in_stack Page
	
	@FindBy(xpath="//*[@class='bg-secondary text-white' and text()='Operations in Stack']")
	WebElement Operations_in_Stack_title;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement btn_tryhere;
 
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getOperations_in_stack_title()
	{
		return Operations_in_Stack_title.getText();
	}
	
	public void click_tryhere()
	{
		js.executeScript("arguments[0].scrollIntoView();", btn_tryhere);
		btn_tryhere.click();
	}
	
//editor
	@FindBy(xpath="//button[text()='Run']")
	WebElement btn_Run;
	public String click_run()
	{
		btn_Run.click();
		return btn_Run.getText();
	}
	@FindBy(xpath="//textarea[@id='editor']")
	WebElement txt_area;
	@FindBy(xpath="//*[@id='output']")
	WebElement txt_output;
	
	public String text_output()
	{
		
		return txt_output.getText();
	}

//implementation page
	
	@FindBy(xpath="//*[@class='bg-secondary text-white' and text()='Implementation']")
	WebElement implementation_title;
	
	public String get_implementation_title()
	{
		return implementation_title.getText();
	}

//application page
	
	@FindBy(xpath="//*[@class='bg-secondary text-white' and text()='Applications']")
	WebElement applications_title;
	
	public String get_applications_title()
	{
		return applications_title.getText();
	}
	
}
