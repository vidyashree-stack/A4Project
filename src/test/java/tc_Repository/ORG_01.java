package tc_Repository;

import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_01 extends BaseClass{
	
	@Test
	public void org_01() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EXUTIL = new ExcelUtility();
		String ORGNAME = EXUTIL.readDataFromExcel("Organization", 2, 1);
		String WEBSITE = EXUTIL.readDataFromExcel("Organization", 2, 2);
		String EMPLOYEES = EXUTIL.readDataFromExcel("Organization", 2, 3);
		HomePage hp = new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage og = new OrgHomePage(driver);
		og.clickOnNewOrgBtn();
		CreateNewOrgPage cn = new CreateNewOrgPage(driver);
		cn.createneworg(ORGNAME+num, WEBSITE, EMPLOYEES);
		Thread.sleep(4000);
	}

}
