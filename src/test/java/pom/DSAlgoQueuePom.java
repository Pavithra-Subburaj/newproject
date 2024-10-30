package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class DSAlgoQueuePom extends DSAlgoCommonPom{

	
	//private WebDriver driver;
	
		public DSAlgoQueuePom(WebDriver driver){
			super(driver);
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// By implementation_in_Python =By.linkText("Implementation of Queue in Python");
		 @FindBy(linkText="Implementation of Queue in Python")
			WebElement implementation_in_Python;
		// By implementation_using_collections =By.linkText("Implementation using collections.deque");
		 @FindBy(linkText="Implementation using collections.deque")
			WebElement implementation_using_collections;
		 //By imp_array=By.linkText("Implementation using array");
		 @FindBy(linkText="Implementation using array")
			WebElement imp_array;
		// By queue_operations =By.linkText("Queue Operations");
		 @FindBy(linkText="Queue Operations")
			WebElement queue_operations;
		 //By tryHere =By.xpath("//a[text()='Try here>>>']");
		 @FindBy(xpath="//a[text()='Try here>>>']")
			WebElement tryHere;
		//By runButton=By.xpath("//button[text()='Run']");
		@FindBy(xpath="//button[text()='Run']")
		WebElement runButton;
		
		@FindBy(xpath="//*[@id='output']")
		WebElement txt_output;
		String actualTitle;
		
		
		
		public void ClickImpQueuePython()
		{
			implementation_in_Python.click();
		}
		
		public void ClickImpCollections()
		{
			implementation_using_collections.click();
		}
		
		public void ClickImpArray()
		{
			imp_array.click();
		}
		
		public void ClickImpQueueOperations()
		{
			queue_operations.click();
		}
		
		public void ClickQueueLink(String string)
		{
			driver.findElement(By.linkText(string)).click();
		}
		
		public void verifyQPage(String title) {
			// TODO Auto-generated method stub
			actualTitle=driver.getTitle();
			Assert.assertEquals(actualTitle, title);
			
		}
		public String getPageTitle() {
			// TODO Auto-generated method stub
			return (driver.getTitle());
			
			
		}
		
		public void click_tryHere()
		{
			js.executeScript("arguments[0].scrollIntoView();", tryHere);
			tryHere.click();
			
		}
		public String click_run()
		{
			runButton.click();
			return (runButton.getText());
			
		}
		
		
		public String text_output()
		{
			
			return txt_output.getText();
		} 
		public void navigatePage()
		{
			driver.navigate().to("https://dsportalapp.herokuapp.com/queue");
		}

}
