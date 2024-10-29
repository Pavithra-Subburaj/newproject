package sd;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.DSAlgoDataStructurePom;
import pom.DSAlgoGetStartedPom;
import pom.DSAlgoHomePom;
import pom.DSAlgoRegistrationPom;
import pom.DSAlgoSignInPom;
import pom.DSAlgoStackPom;
import util.ExcelReader;

public class DSAlgoDataStructureIntro_SD extends DSAlgoCommon_SD {

DSAlgoGetStartedPom getstartedpage_obj = new DSAlgoGetStartedPom(DSAlgoCommon_SD.getDriver());
DSAlgoHomePom homepage_obj=new DSAlgoHomePom(DSAlgoCommon_SD.getDriver());
DSAlgoSignInPom signinpage_obj=new DSAlgoSignInPom(DSAlgoCommon_SD.getDriver());	
DSAlgoStackPom stakpage_obj=new DSAlgoStackPom(DSAlgoCommon_SD.getDriver());
DSAlgoRegistrationPom registrationpage_obj=new DSAlgoRegistrationPom(DSAlgoCommon_SD.getDriver());
DSAlgoDataStructurePom datastructurepage_obj=new DSAlgoDataStructurePom(DSAlgoCommon_SD.getDriver());
Actions act=new Actions(DSAlgoCommon_SD.getDriver());


	@Before("@DataStructure")
	public void setUP()
	{
		DSAlgoCommon_SD.getDriver()
		.get("https://dsportalapp.herokuapp.com/");
		getstartedpage_obj.clickGetStarted();
		homepage_obj.click_Signin();
	    signinpage_obj.setUserName("ninja4");
	    signinpage_obj.setPassword("Tiger123@");
	    signinpage_obj.clickLogin(); 
	   
	}
	@Given ("The user is in home page after login")
	public void the_user_is_in_home_page_after_login()
	{
		if(homepage_obj.findTitle().equals("NumpyNinja"))
		{
			Assert.assertTrue(true);
		}
	}
	@When("The user clicks the Getting Started button in Data Structures-Introduction panel")
	public void the_user_clicks_the_getting_started_button_in_data_structures_introduction_panel() {
		homepage_obj.click_data_structures_introduction();
	}
	@Then("The user should be directed to data structure {string} Page")
	public void the_user_should_be_directed_to_data_structure_page(String title) {
		
		if( datastructurepage_obj.getTitle().equals(title))
		{
			Assert.assertTrue(true);
		}
		else
		{
			 Assert.assertTrue(false);
		}
	    
	}
	
	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		datastructurepage_obj.click_time_complexity();
	}
	
	@Then("The user should be directed to Time Complexity {string} page")
	public void the_user_should_be_directed_to_time_complexity_page(String string) {
	    if( datastructurepage_obj.getTitle().equals(string))
		{
			Assert.assertTrue(true);
		}
		else
		{
			 Assert.assertTrue(false);
		}
	}
	
	@When("The user clicks on time complexity Try here button")
	public void the_user_clicks_on_time_complexity_try_here_button() {
	   
		datastructurepage_obj.tc_click_tryhere();
	}
	
	@Then("The user redirect to time complexity tryEditor page")
	public void the_user_redirect_to_time_complexity_try_editor_page() {
		 Assert.assertEquals(datastructurepage_obj.time_complexity_click_run(), "Run");
	}
	
	@When("enter a python code from the given excel sheetname {string} and rownumber {int}")
	public void enter_a_python_code_from_the_given_excel_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		 ExcelReader reader = new ExcelReader();
			List<Map<String,String>> testData = 
		    reader.getData( System.getProperty("user.dir")+"\\src\\test\\resources\\Utlils\\Python.xlsx", sheetName);
			String code = testData.get(rowNumber).get("code");
			act.sendKeys(code).build().perform();
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
//popup handling		
		try
		   {
			   datastructurepage_obj.time_complexity_click_run();
			   Thread.sleep(5000);
			   driver.switchTo().alert().accept();
			   Assert.assertTrue(false);	
		   }
		  catch(Exception e)
		   {
			      
		   }
	}
//output
	
	
	@Then("User is able to see output in console sheetname {string} and rownumber {int}")
	public void user_is_able_to_see_output_in_console_sheetname_and_rownumber(String sheetName, Integer rowNumber)throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
	    reader.getData( System.getProperty("user.dir")+"\\src\\test\\resources\\Utlils\\Python.xlsx", sheetName);
		String result=testData.get(rowNumber).get("Result");
		Assert.assertEquals(datastructurepage_obj.tc_text_output(),result);
	}
	
	
}
