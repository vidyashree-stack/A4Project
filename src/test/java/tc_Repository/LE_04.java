package tc_Repository;

import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class LE_04 extends BaseClass{
	
	
	@Test(groups= {"regression"})
	public void le_04Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EXUTIL = new ExcelUtility();
		String FIRSTNAME = EXUTIL.readDataFromExcel("Leads", 11, 1);
		String LASTNAME = EXUTIL.readDataFromExcel("Leads", 11, 2);
		String COMPANY = EXUTIL.readDataFromExcel("Leads", 11, 3);
		String STREET = EXUTIL.readDataFromExcel("Leads", 11, 4);
		String POB = EXUTIL.readDataFromExcel("Leads", 11, 5);
		String PCODE= EXUTIL.readDataFromExcel("Leads", 11, 6);
		String CITY = EXUTIL.readDataFromExcel("Leads", 11, 7);
		String COUNTRY = EXUTIL.readDataFromExcel("Leads", 11, 8);
		String STATE= EXUTIL.readDataFromExcel("Leads", 11, 9);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createnewLead(FIRSTNAME+num, LASTNAME, COMPANY, STREET, POB, PCODE, CITY, COUNTRY, STATE);
		Thread.sleep(8000);
	}

}
