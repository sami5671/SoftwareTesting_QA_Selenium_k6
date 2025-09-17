package selenium_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Match_WebPage_Title {

	public static void main(String[] args) {
		// initialize web driver
		WebDriver driver = new ChromeDriver();
		
		// open the Web site
		driver.get("https://plant-world-v2.web.app");
		
		// get title 
		String actualTitle = driver.getTitle();
		
		// expected title 
		String expectedTitle = "Plant World";
		
		// compare title
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("✅ Title matched!");
		} else {
            System.out.println("❌ Title did not match. Found: " + actualTitle);
        }
	}
}
