package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Element {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver_new.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("love today");
		//WebElement element2 = driver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
		WebElement element2 = driver.findElement(By.id("suggestion-search-button"));
		element2.click();	
		WebElement element3 = driver.findElement(By.xpath("(//a[text()='Love Today'])[2]"));
		element3.click();
		//WebElement element4 = driver.findElement(By.xpath("(//div[text()='IMDb RATING'])[1]"));
		//element4.click();	
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		

	}

}
