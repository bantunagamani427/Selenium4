package Selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Features {
	@Test
	public void screenshottest() throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']"));

		File file =logo.getScreenshotAs(OutputType.FILE);

		File dest =new File("logo.png");

		FileUtils.copyFile(file,dest);
        driver.quit();
		
	}
}
