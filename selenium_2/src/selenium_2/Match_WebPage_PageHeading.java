package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Match_WebPage_PageHeading {

	public static void main(String[] args) {
		// initialize web driver
		WebDriver driver = new ChromeDriver();
		
		// open the Web site
		driver.get("https://www.w3schools.com");
		
		// get and store the h1 element
		WebElement h1Element = driver.findElement(By.className("learntocodeh1"));
		String actualH1Text = h1Element.getText();
		String expectedH1Text = "Learn to Code";
		
		// match the text 
		if(actualH1Text.equals(expectedH1Text)) {
			 System.out.println("✅ H1 text matched!");
		}else {
            System.out.println("❌ H1 text did not match. Found: " + actualH1Text);
        }
	}

}
