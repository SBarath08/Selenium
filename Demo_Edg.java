package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_Edg {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\java program\\Test\\Driver\\msedgedriver1.exe");
         WebDriver driver=new EdgeDriver();
         driver.get("https://www.imdb.com/");
         driver.manage().window().maximize();
         WebElement element = driver.findElement(By.id("suggestion-search"));
         element.sendKeys("Singam 2");
         WebElement element2 = driver.findElement(By.id("suggestion-search-button"));
         element2.click();  
         WebElement element3 = driver.findElement(By.xpath("(//div[@class='ipc-metadata-list-summary-item__c'])[1]"));
         element3.click();
         WebElement element4 = driver.findElement(By.xpath("(//button[@aria-label='Rate Singam 2'])[1]"));
         element4.click();
         WebElement element5 = driver.findElement(By.xpath("//button[@aria-label='Rate 6']"));
         element5.sendKeys("Rate 6");
         WebElement element6 = driver.findElement(By.xpath("//span[text()='Rate']"));
             element6.click();
             WebElement element7 = driver.findElement(By.xpath("//span[text()='Sign in with Google']"));
	   element7.click();
	   WebElement element8 = driver.findElement(By.id("identifierId"));
	   element8.sendKeys("Skarun08@gmail.com");
	   WebElement element9 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
	   element9.click();
	   String title = driver.getTitle();
	   System.out.println(title);
	
	
	
	
	
	}
	
	

}
