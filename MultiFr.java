package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\java program\\Test\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(element2);
		driver.switchTo().parentFrame();

		WebElement element3 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	element3.sendKeys("dddddddddddddd");
	}
}
