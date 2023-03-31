package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/submit.html");
		driver.findElement(By.id("username")).sendKeys("tomorrow no holiday");
		Thread.sleep(3000);
		driver.findElement(By.id("button")).submit();
		
		driver.close();
	}

}
