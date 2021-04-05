package Test_Cases;

import org.testng.annotations.Test;

import PageDesignPattern.Frames;

public class Test_Frames extends BaseClass{
	
	Frames f ;

	@Test
	public void clickonFrame() {
		f = new Frames(driver);
		f.ClickOnLink();
	}
	@Test
	public void goInToFrame() throws InterruptedException {
		Thread.sleep(2000);
		f = new Frames(driver);
		f.enterInFrame();
	}
	@Test
	public void afterFrame() {
		f = new Frames(driver);
		f.afterFrame();
	}
}
