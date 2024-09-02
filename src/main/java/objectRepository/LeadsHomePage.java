package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is pom class for lead page
 */
public class LeadsHomePage {
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createnewleadbutton;

	public LeadsHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatenewleadbutton() {
		return createnewleadbutton;
	}
    
	/**
	 * this is a business library to click on new btn
	 */
	public void clickOnNewLeadBtn()
	{
		createnewleadbutton.click();
	}
}
