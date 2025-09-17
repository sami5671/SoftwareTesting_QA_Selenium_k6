package selenium_1;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Page_Using_Selenium {

	public static void main(String[] args) {
		
		// using the chrome_driver to get page
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://plant-world-v2.web.app");
	}
}
