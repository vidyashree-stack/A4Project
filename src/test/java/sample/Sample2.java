package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample2 {
	
	@Test
	public void hardAsserStrickComparision(){
		String expectedData = "raja";
		String actualData = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualData, expectedData);
		System.out.println("strict comparision passed");
		sa.assertAll();
		
	}
	
	@Test
	public void containsLevelComparision(){
		String expectedData = "raja";
		String actualData = "maharaja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparision passed");
		sa.assertAll();
		
	}
	

}
