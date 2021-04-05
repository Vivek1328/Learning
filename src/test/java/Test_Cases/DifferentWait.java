package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DifferentWait {

	public WebDriver driver;
	
	public void test() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(driver.findElement(By.id("")).click();
}
	
}
