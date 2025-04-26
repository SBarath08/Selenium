package Selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\java program\\Test\\Driver\\chromedriver_new.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	WebElement newrg = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	newrg.click();
	WebElement usename = driver.findElement(By.name("username"));
	usename.sendKeys("krishnamurthy211");
	WebElement ps = driver.findElement(By.id("password"));
	ps.sendKeys("123456789");
	WebElement reps = driver.findElement(By.name("re_password"));
	reps.sendKeys("123456789");
	WebElement fullname = driver.findElement(By.name("full_name"));
	fullname.sendKeys("krishna");
	WebElement email = driver.findElement(By.name("email_add"));
	email.sendKeys("krish02341@gmail.com");
	
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Thread.sleep(11000);
	
	WebElement option = driver.findElement(By.id("tnc_box"));
	option.click();
	WebElement rg = driver.findElement(By.id("Submit"));
	rg.click();
	
	WebElement login = driver.findElement(By.xpath("//a[text()='Click here to login']"));
	login.click();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("krishnamurthy211");
     WebElement password = driver.findElement(By.id("password"));	
     password.sendKeys("123456789");
     WebElement loginmain = driver.findElement(By.id("login"));
     loginmain.click();
	
	
	//Thread.sleep(6000);
	//driver.close();
	
	}

}
