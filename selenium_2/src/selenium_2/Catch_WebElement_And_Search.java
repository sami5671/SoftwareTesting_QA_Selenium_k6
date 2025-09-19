// first go to amazon web site search product then select a check box then navigate to another page
package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Catch_WebElement_And_Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.className("a-button-text")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung s24 Ultra");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Spigen")).click();
		
		driver.navigate().to("https://plant-world-v2.web.app/");
		Thread.sleep(2500);
		driver.navigate().back();
	}

}
