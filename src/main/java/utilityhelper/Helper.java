package utilityhelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {

	public void actionDrag_Drop(WebDriver driver, WebElement one,WebElement two) {
		Actions Ac = new Actions(driver);
		Ac.dragAndDrop(one, two);
	}
	
	
}
