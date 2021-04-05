package PageDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AB_Page {

	private WebDriver driver;
	public AB_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="A/B Testing")
	private WebElement Link;
	
//private	By A_BLink= By.linkText("/abtest");
	
	public void clickOnLink() {
	//driver.findElement(A_BLink).click();  
		Link.click();
	}
	public String VerifyTitle() {
		return driver.getTitle();
	}
}
