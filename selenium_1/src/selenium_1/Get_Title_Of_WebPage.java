package selenium_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title_Of_WebPage {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://plant-world-v2.web.app");
		
		// get the title of the page
		System.out.printf("Here is title: " + driver.getTitle());
	}

}
