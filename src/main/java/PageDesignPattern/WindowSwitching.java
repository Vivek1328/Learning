package PageDesignPattern;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WindowSwitching {
	
	
	private WebDriver driver;
	public WindowSwitching(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Multiple Windows')]")
	WebElement Link;
	
	@FindBy(how=How.LINK_TEXT,using="Click Here")
	WebElement CLickhere;
	
	public void clickOnLink() throws InterruptedException {
		
		Thread.sleep(2000);
		Link.click();
	}
	
	public void clickOnClick() {
		CLickhere.click();
	}
	
	public void switchWindow() {
		Set<String> mainwindow=driver.getWindowHandles();
		Iterator<String>it=mainwindow.iterator();
		
		while(it.hasNext()) {
			it.next();
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}
}
