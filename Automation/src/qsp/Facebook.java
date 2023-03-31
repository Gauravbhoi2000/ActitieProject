package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Thane");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.close();
	}

}
