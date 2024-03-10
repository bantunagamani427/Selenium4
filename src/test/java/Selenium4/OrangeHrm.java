package Selenium4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement username=driver.findElement(By.name("username"));
	username.click();
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.name("password"));
	password.click();
	password.sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//	Alert alert=driver.switchTo().alert();
//	String alerttext=alert.getText();
//	System.out.println("Alert Text:"+alerttext);
//	alert.accept();
	driver.findElement(By.xpath("//li[@class=\"oxd-main-menu-item-wrapper\"]"));
	
	
}
	
}
