package TestngPrograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
public static	WebDriver driver;
@BeforeSuite
public void databaseConnection() {
	Reporter.log("database connected",true);
	
}
@AfterSuite
public void databasedisconnected() {
	Reporter.log("database disconnected",true);
}

@BeforeTest
public void launchBrowser() {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/");
}
@AfterTest
public void closeBrowser() {
	driver.close();
	Reporter.log("browser closed",true);
}
@BeforeMethod
public void login() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Reporter.log("logged in successfully",true);
	
}
@AfterMethod
public void logout() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logged out",true);
}

}
