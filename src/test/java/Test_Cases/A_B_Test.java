package Test_Cases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageDesignPattern.AB_Page;

public class A_B_Test extends BaseClass {
//WebDriver driver;
	@Test
	public void verifyA_B() {
		AB_Page ab= new AB_Page(driver);
		ab.clickOnLink();
		AssertJUnit.assertEquals(ab.VerifyTitle(),"The Internet");
		System.out.println(driver);
	}
	
	
}
