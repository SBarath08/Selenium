package Selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Mult_Drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("cars"));
		Select sc=new Select(element);
		sc.selectByValue("volvo");
		sc.selectByIndex(2);
		sc.selectByVisibleText("Audi");
		
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);
			
		sc.deselectByIndex(2);
		Thread.sleep(2000);
		sc.deselectByValue("volvo");
		Thread.sleep(3000);
		sc.deselectByVisibleText("Audi");
		
		List<WebElement> options = sc.getOptions();
		//System.out.println(options);
		for(WebElement web:options) {
			String text = web.getText();
			System.out.println(text);
			
		}
	}

}
