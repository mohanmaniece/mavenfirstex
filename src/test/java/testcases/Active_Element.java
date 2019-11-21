package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Active_Element {

	@Test
	public void opengoogle()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/mohan/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();

		driver.switchTo().activeElement().sendKeys("Poojai"+Keys.ENTER);
	}
}
