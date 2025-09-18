package selenium_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("samialam5671@gmail.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate Next button using text
        WebElement nextBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[text()='Next']/parent::button")
        ));
        nextBtn.click();
	}

}
