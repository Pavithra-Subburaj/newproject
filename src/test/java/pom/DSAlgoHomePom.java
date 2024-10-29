package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DSAlgoHomePom extends DSAlgoCommonPom{

	public DSAlgoHomePom(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//a[@href='stack' and text()='Get Started']")
	WebElement stack_getstarted;
	
	@FindBy(xpath="//a[@href='data-structures-introduction' and text()='Get Started']")
	WebElement data_structures_introduction_getstarted;
	
	@FindBy(xpath="//a[@href='graph' and text()='Get Started']")
	WebElement graph_getstarted;
	
	
	@FindBy(xpath="//a[@href='tree' and text()='Get Started']")
	WebElement tree_getstarted;
		
	@FindBy(xpath="//a[@href='queue' and text()='Get Started']")
	WebElement queue_getstarted;
	
	@FindBy(xpath="//a[@href='linked-list' and text()='Get Started']")
	WebElement linked_list_getstarted;
	
	@FindBy(xpath="//a[@href='array' and text()='Get Started']")
	WebElement array_getstarted;
	
	
	@FindBy(xpath="//*[text()=' Register ']")
	WebElement home_Registerlink;
	
	@FindBy(xpath="//*[text()='Sign in']")
	WebElement home_Signinlink;
	
	@FindBy(xpath="//*[text()='Sign out']")
	WebElement home_Signoutlink;
	
	@FindBy(xpath="//div[normalize-space()='You are logged in']")
	WebElement login_msg;
	
	@FindBy(xpath="//div[normalize-space()='Logged out successfully']")
	WebElement logout_msg;
    
	@FindBy(xpath="//a[text()='Data Structures']")
	WebElement btn_datastructure;

	//dropdown options
	
	@FindBy(xpath="//a[text()='Stack']")
	WebElement option_stack;
	
	@FindBy(xpath="//a[text()='Queue']")
	WebElement option_Queue;
	
	@FindBy(xpath="//a[text()='Arrays']")
	WebElement option_Arrays;
	
	@FindBy(xpath="//a[text()='Linked List']")
	WebElement option_Linked_List;
	
	@FindBy(xpath="//a[text()='Tree']")
	WebElement option_Tree;
	
	@FindBy(xpath="//a[text()='Graph']")
	WebElement option_Graph;
	
	
    public void click_Register() {
		home_Registerlink.click();
	}
	public void click_Signin() {
		home_Signinlink.click();
	}
	public void click_Signout() {
		home_Signoutlink.click();
	}
	
	public String LoginMsg()
	{
		return login_msg.getText();
	}
	
	public String pagesource()
	{
		return driver.getPageSource();
		
	}
	public String LogoutMsg()
	{
		return logout_msg.getText();
	}
	
	public void click_select_stack_options()
	{
		btn_datastructure.click();
		option_stack.click();
	}
	public void click_select_stack()
	{
	//driver.findElement(By.xpath("//a[@href='stack' and text()='Get Started']")).click();
		stack_getstarted.click();
	}
	public void click_data_structures_introduction()
	{
	
		data_structures_introduction_getstarted.click();
	}
	
	public void click_select_Arrays()
	{
		array_getstarted.click();
		
	}
	public void click_select_Arrays_options()
	{
		btn_datastructure.click();
		option_Arrays.click();
	}
	
	public void click_select_dropdown()
	{
		btn_datastructure.click();
		
	}
	
	public void click_select_Linked_List()
	{
		linked_list_getstarted.click();
		
	}
	public void click_select_Linked_List_options()
	{
		btn_datastructure.click();
		option_Linked_List.click();
	}
	
	public void click_select_Queue()
	{
		queue_getstarted.click();
		
	}
	public void click_select_Queue_options()
	{
		btn_datastructure.click();
		option_Queue.click();
	}
	
	public void click_select_Tree()
	{
		tree_getstarted.click();
		
	}
	public void click_select_Tree_options()
	{
		btn_datastructure.click();
		option_Tree.click();
	}
	
	public void click_select_Graph()
	{
		graph_getstarted.click();
		
	}
	public void click_select_Graph_options()
	{
		btn_datastructure.click();
		option_Graph.click();
	}
//not logged in
	@FindBy(xpath="//*[normalize-space()='You are not logged in']")
	WebElement msg_popup_notlogged;
	
	public String get_popup_not_logged()
	{
		return msg_popup_notlogged.getText();
	}
//dropdown validation
	@FindBy(xpath="//a[@class='dropdown-item']")
	List<WebElement> dropdown;
	
	public List<WebElement> get_dropdown_options()
	{
		return dropdown;
	}
	
	public String Find_Registerlink()
	{
		return driver.getPageSource();
	}
	
	public String findTitle()
	{
		return driver.getTitle();
	}
}
