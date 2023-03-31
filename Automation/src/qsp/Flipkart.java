package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
	driver.findElement(By.name("q")).sendKeys("shoes");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).clear();
	Thread.sleep(3000);
	//driver.findElement(By.name("q")).sendKeys("socks");
	//Thread.sleep(3000);

}
}
