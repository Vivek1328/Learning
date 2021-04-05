package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageDesignPattern.Page_Add_Remove;

public class DeleteButton extends BaseClass {

	Page_Add_Remove p;
	
	
	@Test
	public void delete_button() {	
		p = new Page_Add_Remove(driver);
		p.Click_On_Link();
		p.Click_on_AddElement(4);
		int a=p.Delete_Element(2);
		Assert.assertEquals(a, 2);
		
	}
	
	@Test(groups="Testone")
	public void Gone() {
		System.out.println("This is for testing groups 1");
		
	}
	
	@Test(groups="Testone")
	public void Gone2() {
		System.out.println("This is for testing groups 2");
	}
	
	
	
	
	
}
