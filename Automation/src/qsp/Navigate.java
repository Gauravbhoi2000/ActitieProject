
package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();    
		driver.navigate().to("file:///C:/Users/Jspiders%20thane1/Desktop/demo.html");
		driver.findElement(By.id("t1")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.className("c2")).click();
		Thread.sleep(3000);
	 driver.navigate().refresh();
	 Thread.sleep(3000);
	 driver.close();
	}

}
