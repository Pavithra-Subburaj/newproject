package sd;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.DSAlgoGetStartedPom;
import pom.DSAlgoHomePom;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgoGetstartedPage_SD extends DSAlgoCommon_SD{
	
	
	
		public String title;
		DSAlgoGetStartedPom getstartedpage_obj = new DSAlgoGetStartedPom(DSAlgoCommon_SD.getDriver());
		DSAlgoHomePom homepage_obj=new DSAlgoHomePom(DSAlgoCommon_SD.getDriver());
	
		@Before("@main")
		public void setUP() {
			DSAlgoCommon_SD.getDriver()
			.get("https://dsportalapp.herokuapp.com/");
		}
		
		@When("The user should be in GetStarted page")
		public void the_user_should_be_in_get_started_page() {
			if(getstartedpage_obj.getTitle().equals("NumpyNinja"))
			{
				Assert.assertTrue(true);
			}
			
		}
	
		@Then("The user should landed on the page there should be a message {string}")
		public void the_user_should_landed_on_the_page_there_should_be_a_message(String string) {
			if(getstartedpage_obj.main_msg().equals(string))
		    	
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
		}
		@When("The user clicks the get started button")
		public void the_user_clicks_the_get_started_button() {
			getstartedpage_obj.clickGetStarted();
		}
		
		@Then("The user should land in Home Page with {string} and {string} links")
		public void the_user_should_land_in_home_page_with_and_links(String register, String signin) {
			if((homepage_obj.Find_Registerlink().contains(register))||(homepage_obj.Find_Registerlink().contains(signin)))
			{
				
			    	Assert.assertTrue(true);
			}
		    else
		    {
			    	Assert.assertTrue(false);
		    }
		}

		
	}

	