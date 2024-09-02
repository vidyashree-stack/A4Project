package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	
	
	@FindBy(xpath ="//input[@name='firstname']")
	private WebElement FirstName ;
	
	@FindBy(xpath ="//input[@name='lastname']")
	private WebElement LastName ;
	
	@FindBy(xpath ="//input[@name='company']")
	private WebElement Company ;
	
	
	@FindBy(xpath ="//input[@name='designation']")
	private WebElement Title ;
	
	@FindBy(xpath ="//input[@name='phone']")
	private WebElement Phone ;
	
	@FindBy(xpath ="//input[@name='mobile']")
	private WebElement Mobile;
	
	@FindBy(xpath ="//input[@name='email']")
	private WebElement Email ;
	
	@FindBy(xpath ="//input[@name='noofemployees']")
	private WebElement NoOfEmployees ;
	
	@FindBy(xpath ="//textarea[@name='lane']")
	private WebElement Street;
	
	@FindBy(xpath ="//input[@name='pobox']")
	private WebElement PoBox ;
	
	@FindBy(xpath ="//input[@name='code']")
	private WebElement PostalCode;
	
	@FindBy(xpath ="//input[@name='city']")
	private WebElement City ;
	
	@FindBy(xpath ="//input[@name='country']")
	private WebElement Country;
	
	@FindBy(xpath ="//input[@name='state']")
	private WebElement State ;
	
	@FindBy(xpath ="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement SaveBtn;

	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getCompany() {
		return Company;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}

	public WebElement getStreet() {
		return Street;
	}

	public WebElement getPoBox() {
		return PoBox;
	}

	public WebElement getPostalCode() {
		return PostalCode;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	public void createnewLead(String firstname, String lastName, String company)
	{
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastName);
		Company.sendKeys(company);
		SaveBtn.click();
	}
	
	public void createnewLead(String firstname, String lastName, String company, String title, String phone, String mobile, String email, String noofemployee, String street, String pobox, String postal, String city, String country,String state)
	{
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastName);
		Company.sendKeys(company);
		Title.sendKeys(title);
		Phone.sendKeys(phone);
		Mobile.sendKeys(mobile);
		Email.sendKeys(email);
		NoOfEmployees.sendKeys(noofemployee);
		Street.sendKeys(street);
		PoBox.sendKeys(pobox);
		PostalCode.sendKeys(postal);
		City.sendKeys(city);
		Country.sendKeys(country);
		State.sendKeys(state);
		SaveBtn.click();
	}
	
	public void createnewLead(String firstname, String lastName, String company, String title, String phone, String mobile, String email, String noofemployee)
	{
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastName);
		Company.sendKeys(company);
		Title.sendKeys(title);
		Phone.sendKeys(phone);
		Mobile.sendKeys(mobile);
		Email.sendKeys(email);
		NoOfEmployees.sendKeys(noofemployee);
	}
	public void createnewLead(String firstname, String lastName, String company, String street, String pobox, String postal, String city, String country,String state)
	{
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastName);
		Company.sendKeys(company);
		Street.sendKeys(street);
		PoBox.sendKeys(pobox);
		PostalCode.sendKeys(postal);
		City.sendKeys(city);
		Country.sendKeys(country);
		State.sendKeys(state);
		SaveBtn.click();
		
	}
}


