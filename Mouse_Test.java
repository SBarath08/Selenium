package Selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions ac =new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement element = driver.findElement(By.id("droppable"));
		//ac.clickAndHold(drag).moveToElement(element).perform();
		ac.dragAndDrop(drag, element).perform();
		
	}

}
