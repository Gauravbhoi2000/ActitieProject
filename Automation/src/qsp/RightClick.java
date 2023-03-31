package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		WebElement element = driver.findElement(By.linkText("actiTIME Inc."));
		Actions ac=new Actions(driver);
		Thread.sleep(5000); 
		ac.contextClick(element).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
