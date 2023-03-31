package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDrop {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/QSPRestaurant.html");
	WebElement menu = driver.findElement(By.id("hotel menu"));
	Select s=new Select(menu);
	Thread.sleep(3000);
	s.selectByIndex(0);
	Thread.sleep(3000);
	s.selectByVisibleText("chicken lollipop");
	Thread.sleep(3000);
	s.selectByValue("ct");
	Thread.sleep(3000);
	s.selectByVisibleText("ice cream");
	Thread.sleep(3000);
	s.deselectByValue("ic");
	Thread.sleep(3000);
	s.deselectByIndex(0);
	Thread.sleep(3000);
	driver.close();
	
}
}
