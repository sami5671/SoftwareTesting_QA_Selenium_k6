package selenium_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", 
	                "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/r.php?entry_point=login");

	        // Example usage of utility method
	        WebElement firstname = driver.findElement(By.name("firstname"));
	        WebElement lastname = driver.findElement(By.name("lastname"));

	        sendKeys(driver, firstname, Duration.ofSeconds(2000), "sami");
	        sendKeys(driver, lastname, Duration.ofSeconds(3000), "alam");
	        
	    }

	    // Reusable method for sending text with explicit wait
	    public static void sendKeys(WebDriver driver, WebElement element, Duration timeout, String value) {
	        new WebDriverWait(driver, timeout)
	                .until(ExpectedConditions.visibilityOf(element));
	        element.clear(); // optional
	        element.sendKeys(value);
	    }
	
}

