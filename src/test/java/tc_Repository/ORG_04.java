package tc_Repository;

import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_04 extends BaseClass{
		
		@Test
		public void org_04() throws Exception {
			JavaUtility JUTIL = new JavaUtility();
			int num = JUTIL.getRandomNumber(1000);
			ExcelUtility EXUTIL = new ExcelUtility();
			String ORGNAME = EXUTIL.readDataFromExcel("Organization", 11, 1);
			String WEBSITE = EXUTIL.readDataFromExcel("Organization", 11, 2);
			String EMPLOYEES = EXUTIL.readDataFromExcel("Organization", 11, 3);
			String PHN = EXUTIL.readDataFromExcel("Organization", 11, 4);
			String OTHERPHN = EXUTIL.readDataFromExcel("Organization", 11, 5);
			String EMAIL = EXUTIL.readDataFromExcel("Organization", 11, 6);
			String BILLINGADD = EXUTIL.readDataFromExcel("Organization", 11, 7);
			String BILLINGCITY = EXUTIL.readDataFromExcel("Organization", 11, 8);
			String BILLINGSTATE = EXUTIL.readDataFromExcel("Organization", 11, 9);
			HomePage hp = new HomePage(driver);
			hp.clickOnOrg();
			OrgHomePage og = new OrgHomePage(driver);
			og.clickOnNewOrgBtn();
			CreateNewOrgPage cn = new CreateNewOrgPage(driver);
			cn.createneworg(ORGNAME+num, WEBSITE, EMPLOYEES, PHN, OTHERPHN, EMAIL, BILLINGADD, BILLINGSTATE, BILLINGCITY);
			Thread.sleep(4000);
		}

	}


