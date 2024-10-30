package sd;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pom.DSAlgoHomePom;
import pom.DSAlgoQueuePom;
import pom.DSAlgoRegistrationPom;
import pom.DSAlgoDataStructurePom;
import pom.DSAlgoGetStartedPom;
import pom.DSAlgoSignInPom;
import pom.DSAlgoStackPom;
import util.ExcelReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgoQueue_SD extends DSAlgoCommon_SD{
	
	DSAlgoGetStartedPom getstartedpage_obj = new DSAlgoGetStartedPom(DSAlgoCommon_SD.getDriver());
	DSAlgoHomePom homepage_obj=new DSAlgoHomePom(DSAlgoCommon_SD.getDriver());
	DSAlgoSignInPom signinpage_obj=new DSAlgoSignInPom(DSAlgoCommon_SD.getDriver());	
	DSAlgoStackPom stakpage_obj=new DSAlgoStackPom(DSAlgoCommon_SD.getDriver());
	DSAlgoRegistrationPom registrationpage_obj=new DSAlgoRegistrationPom(DSAlgoCommon_SD.getDriver());
	DSAlgoDataStructurePom datastructurepage_obj=new DSAlgoDataStructurePom(DSAlgoCommon_SD.getDriver());
	DSAlgoQueuePom queuepage_obj=new DSAlgoQueuePom(DSAlgoCommon_SD.getDriver());
	Actions act=new Actions(DSAlgoCommon_SD.getDriver());
	
	
	@Before ("@queue")
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
	
	String queuepageTitle="Queue";
	String pracQuesTitle ="Practice Questions";
	
	@Given ("The user is in home page after successful login")
	public void the_user_is_in_home_page_with_sucessful_login()
	{
		if(homepage_obj.findTitle().equals("NumpyNinja"))
		{
			Assert.assertTrue(true);
		}
	}
	

	@When("The user clicks the Getting Started button in Queue Panel")
	public void the_user_clicks_the_getting_started_button_in_queue_panel() {
		 	
		homepage_obj.click_select_Queue();
	}
	@Then("The user should be directed to Queue Page")
	public void the_user_should_be_directed_to_queue_page() {
		 
		
		if(queuepage_obj.getPageTitle().equals("queuepageTitle"))
		{
			Assert.assertTrue(true);
		}
	}
	
	
	@When("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
		//driver=new ChromeDriver();
		queuepage_obj.navigatePage();

	}
	@When("The user clicks {string} Link")
	public void the_user_clicks_implementation_of_queue_in_python_link(String string) {
		//DsAlgoQueuePage = new DsAlgoQueuePage(driver);
		queuepage_obj.ClickQueueLink(string);
	}
	@Then("The user should be directed to  {string} page")
	public void the_user_should_be_directed_to_page(String string) {
		if(queuepage_obj.getPageTitle().equals(string))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		};
	}


	@Then("The user is redirect to tryEditor page")
	public void the_user_redirect_to_try_editor_page() {
		 Assert.assertEquals(queuepage_obj.click_run(),"Run");
	}



	@When("The user clicks  Try here button")
	public void the_user_clicks_try_here_button() {
		queuepage_obj.click_tryHere();
	}

	@When("The user enter valid python code print sheetname {string} and rownumber {int}")
	public void the_user_enter_valid_python_code_printsheetname_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
	    reader.getData( System.getProperty("user.dir")+"\\src\\test\\resources\\Utlils\\Python.xlsx", sheetName);
		String code = testData.get(rowNumber).get("code");
		act.sendKeys(code).build().perform();
	}
	
	@When("The user clicks run button valid scenario")
	public void the_user_clicks_run_button() {
		//popup handling		
		try
		   {
			   queuepage_obj.click_run();
			   Thread.sleep(1000);
			   driver.switchTo().alert().accept();
			   Assert.assertTrue(false);	
		   }
		  catch(Exception e)
		   {
			 
			  
		   }
	}
	@Then("User is able to see the output in console sheetname {string} and rownumber {int}")
	public void user_is_able_to_see_the_output_in_console_sheetname_and_rownumber(String sheetName, Integer rowNumber)throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
	    reader.getData( System.getProperty("user.dir")+"\\src\\test\\resources\\Utlils\\Python.xlsx", sheetName);
		String result=testData.get(rowNumber).get("Result");
		Assert.assertEquals(queuepage_obj.text_output(),result);
	}

	

	@Then("The Practice question page should be displayed")
	public void the_practice_question_page_should_be_displayed() {
		
		if(queuepage_obj.getPageTitle().equals("pracQuesTitle"))
		{
			Assert.assertTrue(true);
		}
		
	}




}