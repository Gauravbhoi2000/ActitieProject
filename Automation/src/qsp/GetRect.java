package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	Thread.sleep(3000);
	int yaxis = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getY();
	
	int xaxis = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getX();
	
	int height = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getHeight();
	int width = driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).getRect().getWidth();
	System.out.println("yaxis is "+yaxis+"  height is "+height);
	System.out.println("xaxis is "+xaxis+"  width is "+width);
	
	driver.close();
}
}
