package tc_Repository;


import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_03 extends BaseClass{
	
	
	@Test(groups= {"smoke" , "regression"})
	public void le_03Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EXUTIL = new ExcelUtility();
		String FIRSTNAME = EXUTIL.readDataFromExcel("Leads", 8, 1);
		String LASTNAME = EXUTIL.readDataFromExcel("Leads", 8, 2);
		String COMPANY = EXUTIL.readDataFromExcel("Leads", 8, 3);
		String TITLE = EXUTIL.readDataFromExcel("Leads", 8, 4);
		String PHONE = EXUTIL.readDataFromExcel("Leads", 8, 5);
		String MOBILE = EXUTIL.readDataFromExcel("Leads", 8, 6);
		String EMAIL = EXUTIL.readDataFromExcel("Leads", 8, 7);
		String NOE= EXUTIL.readDataFromExcel("Leads", 8, 8);
		
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createnewLead(FIRSTNAME + num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE);
		Thread.sleep(4000);
	}

}
