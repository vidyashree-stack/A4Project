package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
	
	@FindBy(xpath ="//input[@name='accountname']")
	private WebElement orgName ;
	
	
	@FindBy(xpath ="//input[@name='website']")
	private WebElement webSite ;
	
	@FindBy(xpath ="//input[@name='employees']")
	private WebElement employees ;
	
	@FindBy(xpath ="//input[@name='phone']")
	private WebElement phNumber ;
	
	
	@FindBy(xpath ="//input[@name='otherphone']")
	private WebElement othPhNumber ;
	
	@FindBy(xpath ="//input[@name='email1']")
	private WebElement email ;
	
	
	@FindBy(xpath ="//textarea[@name='bill_street']")
	private WebElement billingAddress ;
	
	
	@FindBy(xpath ="//input[@name='bill_city']")
	private WebElement billingCity ;
	
	@FindBy(xpath ="//input[@name='bill_state']")
	private WebElement BillingState ;
	
	@FindBy(xpath ="(//input[@title=\"Save [Alt+S]\"])[2]")
	private WebElement saveBtn;

	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrgName() {
		return orgName;
	}



	public WebElement getWebSite() {
		return webSite;
	}



	public WebElement getEmployees() {
		return employees;
	}



	public WebElement getPhNumber() {
		return phNumber;
	}



	public WebElement getOthPhNumber() {
		return othPhNumber;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getBillingAddress() {
		return billingAddress;
	}



	public WebElement getBillingCity() {
		return billingCity;
	}



	public WebElement getBillingState() {
		return BillingState;
	}



	public WebElement getSaveBtn() {
		return saveBtn;
	}



	public void createneworg(String Name, String WebSite, String Employees)
	{
		orgName.sendKeys(Name);
		webSite.sendKeys(WebSite);
		employees.sendKeys(Employees);
		saveBtn.click();
	}
	
	public void createneworg(String Name, String WebSite, String Employees, String Phn, String OtherPhn, String Email)
	{
		orgName.sendKeys(Name);
		webSite.sendKeys(WebSite);
		employees.sendKeys(Employees);
		phNumber.sendKeys(Phn);
		othPhNumber.sendKeys(OtherPhn);
		email.sendKeys(Email);
		saveBtn.click();
	}
	
	public void createneworg(String Name, String WebSite, String BillingAdd, String billingState, String BillingCity)
	{
		orgName.sendKeys(Name);
		webSite.sendKeys(WebSite);
		billingAddress.sendKeys(BillingAdd);
		billingCity.sendKeys(BillingCity);
		BillingState.sendKeys(billingState);
		saveBtn.click();
	}
	
	public void createneworg(String Name, String WebSite, String Employees, String Phn, String OtherPhn, String Email, String BillingAdd, String billingState, String BillingCity)
	{
		orgName.sendKeys(Name);
		webSite.sendKeys(WebSite);
		employees.sendKeys(Employees);
		phNumber.sendKeys(Phn);
		othPhNumber.sendKeys(OtherPhn);
		email.sendKeys(Email);
		billingAddress.sendKeys(BillingAdd);
		billingCity.sendKeys(BillingCity);
		BillingState.sendKeys(billingState);
		saveBtn.click();
	}
	
}
		
	
	
	
	
