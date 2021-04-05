package Test_Cases;

import org.testng.annotations.Test;

import PageDesignPattern.Drag_Drop;

public class Test_DragDrop extends BaseClass {

	Drag_Drop d;
	
	@Test
	public void getLink() {
		d =  new Drag_Drop(driver);
		d.clickonlink();
System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void dragdrop() {
		d =  new Drag_Drop(driver);
		d.dragToSecound();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void gettext() {
		d =  new Drag_Drop(driver);
		d.validatedrop();
	}
}
