package sd;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import pom.DSAlgoSignInPom;
import pom.DSAlgoStackPom;
import pom.DSAlgoDataStructurePom;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.DSAlgoGetStartedPom;
import pom.DSAlgoHomePom;
import pom.DSAlgoQueuePom;
import pom.DSAlgoRegistrationPom;


public class DSAlgoCommon_SD {

	public WebDriver driver;
	public DSAlgoGetStartedPom getstartedpage_obj;
	public DSAlgoHomePom homepage_obj;
	public DSAlgoSignInPom signinpage_obj;
	public DSAlgoStackPom stakpage_obj;
	public DSAlgoDataStructurePom datastructurepage_obj;
	public DSAlgoRegistrationPom registrationpage_obj;
	public DSAlgoQueuePom queuepage_obj;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser
	 * 
	 * @param browser
	 * @return this will return tldriver.
	 */
	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		}  else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
}
