package Test_Cases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
	public void browserInvoke() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	//@AfterMethod
	//public void goback() {
	//	driver.navigate().back();
//	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}


