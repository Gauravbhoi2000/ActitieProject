package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	int height = driver.findElement(By.name("email")).getSize().getHeight();
	
	int width = driver.findElement(By.name("email")).getSize().getWidth();
	System.out.println("height of facebook textfield is="+height);
	System.out.println("width of facebook textfield is="+width);
	driver.close();
}
}
