package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java program\\Test\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage() .window().maximize();
	//	driver.close();
		//driver.quit();
		
	//	driver.navigate().to("https://www.youtube.com/");
		//driver.navigate().back();
	//	String title = driver.getTitle();
	//	System.out.println(title);
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//String currentUrl = driver.getCurrentUrl();
	//	System.out.println(currentUrl);
		
		//WebElement element = driver.findElement(By.id("email"));
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("baarath@gmail.com");
		
		//WebElement element2 = driver.findElement(By.name("pass"));
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		element2.sendKeys("skbarath@gmail.com");
		//WebElement element3 = driver.findElement(By.name("login"));
		WebElement element3 = driver.findElement(By.xpath("//button[@name='login']"));
		//element3.click();
		
		//element3.click();
		
		
		
		
	
	
	
	}

}
