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

public class Keyb {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver_new.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=8318213051682611928&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.contextClick(element).perform();

		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		rc.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
		for (String str : windowHandles) {
			driver.switchTo().window(str);
		String title = driver.getTitle();
		
			System.out.println(title); 
			
			
			//driver.manage().timeouts().implicitlyWait( 1, TimeUnit.MINUTES);
			//driver.quit();

		}
		
		
	}

}
