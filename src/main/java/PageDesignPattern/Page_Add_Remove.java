package PageDesignPattern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Add_Remove {
private WebDriver driver;
	
	
	public Page_Add_Remove(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(how=How.LINK_TEXT,using="Add/Remove Elements")
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Add/Remove Elements')]")
	
	private WebElement Link;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add Element')]")
	private WebElement Add_Element;
	
	//@FindBy(how=How.XPATH,using="//button[@onclick='deleteElement()']")
	@FindBy(how=How.XPATH,using="//div[@id='elements']")
	
	By deleteButton = By.xpath("//button[@onclick='deleteElement()']");

	private WebElement DeleteElement;
	
	
	public void Click_On_Link() {
		Link.click();
	}
	
	public void Click_on_AddElement(int num) {
					Actions action = new Actions(driver);
			//action.doubleClick(Add_Element);
			
			for(int i =0; i < num; i++) {
				Add_Element.click();
			}
		
	}
	
	public int Delete_Element(int deleteNumber) {
		int elements = driver.findElements(deleteButton).size();
		System.out.println("Delete buttons count: "+elements);
		for(int i=0;i<deleteNumber;i++) {
			driver.findElement(deleteButton).click();
		}
		int elementsize=driver.findElements(deleteButton).size();
		//System.out.println(elementsize);
		return elementsize;
	}
}