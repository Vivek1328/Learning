package PageDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxes {

	private WebDriver driver;

	public CheckBoxes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "Checkboxes")
	WebElement Link;

	// @FindBy(how=How.XPATH, using =
	// "//*[@id='checkboxes']/input[@type='checkbox']")
	By Checkbox2 = By.xpath("//*[@id='checkboxes']/input[@type='checkbox'][2]");
	// WebElement Checkbox2;

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][1]")
	WebElement Checkbox1;

	By checkBox1 = By.cssSelector("input:nth-child(1)");
	By checkBox2 = By.cssSelector("input:nth-child(3)");

	public void clickonLink() {
		Link.click();
	}

	public String gettitle() {
		return driver.getTitle();
	}

	public void toverifydefaultcheckbox() {

		System.out.println(driver.findElement(checkBox1).isSelected());
		System.out.println(driver.findElement(checkBox2).isSelected());
	}

	public boolean clickonFirstCheckbox() {
		Checkbox1.click();
		return Checkbox1.isSelected();
	}

}
