package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement daydrop = driver.findElement(By.name("birthday_day"));
	Select s=new Select(daydrop);
	s.selectByIndex(10);
	Thread.sleep(5000);
	WebElement monthdrop = driver.findElement(By.name("birthday_month"));
	Select m=new Select(monthdrop);
	m.selectByIndex(11);
	Thread.sleep(5000);
	WebElement yeardrop = driver.findElement(By.name("birthday_year"));
	Select y=new Select(yeardrop);
	y.selectByValue("2020");
	Thread.sleep(5000);
	
	driver.close();
}
}
