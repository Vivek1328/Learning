package Test_Cases;

import org.testng.annotations.Test;

import PageDesignPattern.WindowSwitching;

public class Test_Switching extends BaseClass {
	
	WindowSwitching ws;

	
	@Test
	public void clickonlink() throws InterruptedException {
		ws = new WindowSwitching(driver);
		ws.clickOnLink();
		ws.clickOnClick();
	}
	
	@Test
	public void getwindowhandle() {
		ws = new WindowSwitching(driver);
		System.out.println("Window switch started");
		ws.switchWindow();
	}
}
