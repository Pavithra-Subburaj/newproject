package pom;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import util.ExcelReader;

public class DSAlgoDataStructurePom extends DSAlgoCommonPom  {
	Actions act;
	public DSAlgoDataStructurePom(WebDriver driver) {
		super(driver);
		
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;

	@FindBy(xpath="//h4[@class='bg-secondary text-white' and text()='Data Structures-Introduction']")
	WebElement ds_page_title;
	
	public String get_ds_tile_page()
	{
		return ds_page_title.getText();
	}
//time complexity
  @FindBy(xpath="//a[text()='Time Complexity']")
	WebElement ds_Time_Complexity;	
	
  public void click_time_complexity()
  {
	  ds_Time_Complexity.click();
  }
  @FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tc_btn_tryhere;
  
  public void tc_click_tryhere()
	{
		js.executeScript("arguments[0].scrollIntoView();", tc_btn_tryhere);
		tc_btn_tryhere.click();
	}
//editor
  @FindBy(xpath="//button[text()='Run']")
	WebElement tc_btn_Run;
  @FindBy(xpath="//*[@id='output']")
	WebElement tc_txt_output;
  
  public String time_complexity_click_run()
	{
		tc_btn_Run.click();
		return tc_btn_Run.getText();
	}

  public String tc_text_output()
	{
		
		return tc_txt_output.getText();
	}
  
  public String getTitle() {
	  return driver.getTitle();
  }
 
  

}
