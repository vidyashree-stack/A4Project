package tc_Repository;


import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_02 extends BaseClass{
	
	
	@Test(groups= {"smoke"})
	public void le_02Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EXUTIL = new ExcelUtility();
		String FIRSTNAME = EXUTIL.readDataFromExcel("Leads", 5, 1);
		String LASTNAME = EXUTIL.readDataFromExcel("Leads", 5, 2);
		String COMPANY = EXUTIL.readDataFromExcel("Leads", 5, 3);
		String TITLE = EXUTIL.readDataFromExcel("Leads", 5, 4);
		String PHONE = EXUTIL.readDataFromExcel("Leads", 5, 5);
		String MOBILE = EXUTIL.readDataFromExcel("Leads", 5, 6);
		String EMAIL = EXUTIL.readDataFromExcel("Leads", 5, 7);
		String NOE= EXUTIL.readDataFromExcel("Leads", 5, 8);
		String STREET = EXUTIL.readDataFromExcel("Leads", 5, 9);
		String POB = EXUTIL.readDataFromExcel("Leads", 5, 10);
		String PCODE= EXUTIL.readDataFromExcel("Leads", 5, 11);
		String CITY = EXUTIL.readDataFromExcel("Leads", 5, 12);
		String COUNTRY = EXUTIL.readDataFromExcel("Leads", 5, 13);
		String STATE= EXUTIL.readDataFromExcel("Leads", 5, 14);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createnewLead(FIRSTNAME+ num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE, STREET, POB,PCODE, CITY, COUNTRY, STATE);
		Thread.sleep(4000);
	}
	
}
