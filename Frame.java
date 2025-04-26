package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame("singleframe");
		WebElement element = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(element);
		WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		element2.sendKeys("jav2222a");



	}

}
