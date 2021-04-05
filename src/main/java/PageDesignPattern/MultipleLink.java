package PageDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MultipleLink {

	
	WebDriver driver;
	public MultipleLink(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how=How.TAG_NAME,using="a")
	WebElement link;
	
	
	public void getLinkCount() {
		
	}
}
