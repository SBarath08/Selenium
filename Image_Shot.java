package Selenium.com;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Image_Shot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java program\\Test\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		/*Thread.sleep(200);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\java program\\Test\\ScreenSht\\image.png");
		FileUtils.copyFile(src, des);*/
		
		WebElement element = driver.findElement(By.name("firstname"));
		element.sendKeys("Vijay");
		WebElement element2 = driver.findElement(By.name("lastname"));
		element2.sendKeys("S");
		WebElement db = driver.findElement(By.name("birthday_day"));
		Select sc=new Select(db);
		//sc.selectByValue("5");
		//sc.deselectByValue("5");
		sc.selectByValue("15");
		WebElement bmon = driver.findElement(By.name("birthday_month"));
		Select sc1=new Select(bmon);
		//sc1.selectByIndex(10);
		sc1.selectByVisibleText("Nov");
		WebElement by = driver.findElement(By.name("birthday_year"));
		Select sc2=new Select(by);
		sc2.selectByValue("2000");
		WebElement element3 = driver.findElement(By.xpath("//input[@value='2']"));
		element3.click();
		WebElement element4 = driver.findElement(By.name("reg_email__"));
		element4.sendKeys("Vijays009@gmail.com");
		WebElement element5 = driver.findElement(By.name("reg_passwd__"));
		element5.sendKeys("Vijay1234");
		WebElement element6 = driver.findElement(By.name("websubmit"));
		element6.click();
		
		//screen short
		Thread.sleep(10000);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("D:\\java program\\Test\\ScreenSht\\fs1.png");
		FileUtils.copyFile(src, des);
		

		
	/*	List<WebElement> options = sc1.getOptions();
		System.out.print(options);
		
		for(WebElement web: options) {
			String text = web.getText();
			System.out.println(text);
		}
		*/
		

	}

}
