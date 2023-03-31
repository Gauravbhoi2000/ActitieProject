package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/Page1.html");
		driver.findElement(By.id("t1")).sendKeys("Qsp");
		driver.switchTo().frame(0);
		driver.findElement(By.name("n2")).sendKeys("Jsp");
		Thread.sleep(5000);
		driver.close();
	}

}





