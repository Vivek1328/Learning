package PageDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Frames {
	
	private WebDriver driver;
	public Frames(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using="Nested Frames")
	WebElement Link;
	
	@FindBy(how=How.XPATH,using="//div[@id='content']")
	WebElement MiddleFrame;
	
	
	public void ClickOnLink() {
		Link.click();
	}
	public void enterInFrame() {
		driver.switchTo().frame("frame-top");
		System.out.println("In Middle");
		driver.switchTo().frame("frame-middle");
		System.out.println(MiddleFrame.getText());
		//System.out.println(driver.getCurrentUrl());
	}
	
	public void afterFrame() {
		driver.switchTo().defaultContent();
		System.out.println(driver.getCurrentUrl());
	}
}
