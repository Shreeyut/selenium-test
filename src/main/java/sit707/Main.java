package sit707;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/guest1/Downloads/chromedriver-win64(1)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		
		driver.get("https://www.google.com");
		
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
}
