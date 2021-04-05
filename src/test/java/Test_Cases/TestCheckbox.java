package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageDesignPattern.CheckBoxes;

public class TestCheckbox extends BaseClass {
public CheckBoxes cb;
	
	/*@Test
	public void verifyTitle() {
		 cb = new CheckBoxes(driver);
		cb.clickonLink();
		System.out.println(cb.gettitle());
	}*/
	
	@Test
	public void checkboxesfunctionality() throws InterruptedException {
		cb = new CheckBoxes(driver);
		Thread.sleep(2000);
		cb.toverifydefaultcheckbox();
		//Assert.assertEquals(cb.toverifydefaultcheckbox(), true);  
	//	cb.clickonFirstCheckbox();
	}
}
