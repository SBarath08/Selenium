package Selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract_Sele {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions tab=new Actions(driver); // mouse function
		WebElement newtab = driver.findElement(By.xpath("//img[@alt='Mobiles']"));
	    	tab.contextClick(newtab).perform();
	    	
	    	
	    	Robot mouse=new Robot(); // keyboard function
	    	mouse.keyPress(KeyEvent.VK_PAGE_DOWN);
	    	mouse.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    	
	    	//mouse.keyPress(KeyEvent.VK_DOWN);
	    	//mouse.keyRelease(KeyEvent.VK_DOWN);
	    	
	    	mouse.keyPress(KeyEvent.VK_ENTER);
	    	mouse.keyRelease(KeyEvent.VK_ENTER);
	    	
	    	driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	    	String windowHandle = driver.getWindowHandle();	   
	    	System.out.println(windowHandle);
	    	
	    	Set<String> windowHandles = driver.getWindowHandles();
	    	
	    	int size = windowHandles.size();
	    	System.out.println(size);
	    	
	    	System.out.println(windowHandles);
			for (String str : windowHandles) {
				driver.switchTo().window(str);
			//String title = driver.getTitle();
			
				//System.out.println(title); 
			}
	    	
	    	
	    	//Thread.sleep(6000);
	    	//driver.quit();

	}

}
