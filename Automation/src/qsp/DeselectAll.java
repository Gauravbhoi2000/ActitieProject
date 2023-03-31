package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/QSPRestaurant.html");
	WebElement menu = driver.findElement(By.id("hotel menu"));
	Select s=new Select(menu);
	Thread.sleep(2000);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByIndex(1);
	Thread.sleep(2000);
	s.selectByIndex(2);
	Thread.sleep(2000);
	s.selectByIndex(3);
	Thread.sleep(2000);

	List<WebElement> alloptions = s.getAllSelectedOptions();
	int count = alloptions.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String option = alloptions.get(i).getText();
		System.out.println(option);
		
	}
	
	
	
	
	driver.close();
	
}
}
