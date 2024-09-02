package sample;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Sample3 {
	
	@Test
	public void hardAsserStrickComparision(){
		String expectedData = "raja";
		String actualData = "Raja";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("strict comparision passed");
		
	}
	@Test
	public void ContainsLevelComparision(){
		String expectedData = "raja";
		String actualData = "maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparision passed");
		
	}

}
