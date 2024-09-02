package tc_Repository;

import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

       public class ORG_03 extends BaseClass{
	
		@Test
		public void org_03() throws Exception {
			JavaUtility JUTIL = new JavaUtility();
			int num = JUTIL.getRandomNumber(1000);
			ExcelUtility EXUTIL = new ExcelUtility();
			String ORGNAME = EXUTIL.readDataFromExcel("Organization", 8, 1);
			String WEBSITE = EXUTIL.readDataFromExcel("Organization", 8, 2);
			String BILLINGADD = EXUTIL.readDataFromExcel("Organization", 8, 3);
			String BILLINGCITY = EXUTIL.readDataFromExcel("Organization", 8, 4);
			String BILLINGSTATE = EXUTIL.readDataFromExcel("Organization", 8, 5);
			HomePage hp = new HomePage(driver);
			hp.clickOnOrg();
			OrgHomePage og = new OrgHomePage(driver);
			og.clickOnNewOrgBtn();
			CreateNewOrgPage cn = new CreateNewOrgPage(driver);
			cn.createneworg(ORGNAME+num, WEBSITE, BILLINGADD, BILLINGSTATE, BILLINGCITY);
			Thread.sleep(4000);
		}

	}


