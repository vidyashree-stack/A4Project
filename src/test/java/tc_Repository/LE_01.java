package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericProperty.BaseClass;
import genericProperty.ExcelUtility;
import genericProperty.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;


@Listeners(genericProperty.ListnerImplementationClass.class)
public class LE_01 extends BaseClass{
	
	@Test//(groups= {"regression"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EXUTIL = new ExcelUtility();
		String FIRSTNAME = EXUTIL.readDataFromExcel("Leads", 2, 1);
		String LASTNAME = EXUTIL.readDataFromExcel("Leads", 2, 2);
		String COMPANY = EXUTIL.readDataFromExcel("Leads", 2, 3);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn = new CreateNewLeadPage(driver);
		cn.createnewLead(FIRSTNAME+num, LASTNAME, COMPANY);
		Thread.sleep(4000);
		System.out.println("TC_01 runs Successfully");
	}

}
