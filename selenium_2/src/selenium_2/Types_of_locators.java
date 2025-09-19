package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Types_of_locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// Id locator
		driver.get("http://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("samialam5671@gmail.com");
		
		// name locator
		driver.get("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
//		
		// link text locator
		driver.get("http://login.yahoo.com/");
		driver.findElement(By.linkText("Forgot username?")).click();
		driver.navigate().back();
		
		// CSS selector locator
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login-username")).sendKeys("samialam5671@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login-signin")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		// partial text link locator
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		
		// xPath locator
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("rana@mail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}

}
