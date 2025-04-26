package Selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}

}
