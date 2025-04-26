package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		/*	WebElement element2 = driver.findElement(By.id("alertButton"));
		element2.click(); 
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//time alert
		//Thread.sleep(6000);


		WebElement sec = driver.findElement(By.id("timerAlertButton"));
		sec.click();
		Thread.sleep(5004);
		driver.switchTo().alert().accept();


		/*WebElement element = driver.findElement(By.xpath("(//button[text()='Click me'])[3]"));
		element.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		 */

		WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("(//button[@class='btn btn-info'])"));
		element2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("welcome");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();





	}

}
