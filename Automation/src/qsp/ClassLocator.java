package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.className("c1")).click();
		Thread.sleep(5000);
		driver.close();  
		
	}

}
