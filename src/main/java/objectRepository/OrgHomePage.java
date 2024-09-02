package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgHomePage {
	/**
	 * this is pom class for org page
	 */
	@FindBy(xpath ="//img[@title='Create Organization...']")
	private WebElement createneworgbutton;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getCreateneworgbutton() {
		return createneworgbutton;
	}
	
	/**
	 * this is a business library to click on new btn
	 */
	public void clickOnNewOrgBtn()
	{
		createneworgbutton.click();
	}
}
	
