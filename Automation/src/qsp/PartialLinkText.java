package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook/.com");
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("create")).click();
	Thread.sleep(5000);
	driver.close();
}
}
