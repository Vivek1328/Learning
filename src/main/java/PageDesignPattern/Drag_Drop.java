package PageDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilityhelper.Helper;

public class Drag_Drop {

	WebDriver driver;
	Helper h;
	
	public Drag_Drop(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Drag and Drop")
	WebElement link;
	
	@FindBy(how=How.XPATH,using="//div[@id='column-a']")
	WebElement elementone;
	
	@FindBy(how=How.XPATH,using="//div[@id='column-b']")
	WebElement elementtwo;
	
	@FindBy(how=How.XPATH,using="//div[@id='column-b']")
	WebElement validatingPath;
	
	public void clickonlink() {
		link.click();
	}
	
	public void dragToSecound() {
		h = new Helper();
		h.actionDrag_Drop(driver, elementone, elementtwo);
	}
	
	public void validatedrop() {
		System.out.println(validatingPath.getText());
		
		
	}
}
