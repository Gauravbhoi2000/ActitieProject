package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
	 driver.get("https://www.simplilearn.com/corporate-training");
	driver.findElement(By.xpath("(//a[@class='btn contact-btn'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("firstname")).sendKeys("jspiders");
	driver.findElement(By.name("lastname")).sendKeys("Thane");
	driver.findElement(By.name("email")).sendKeys("jspiders@gmail.com");
	driver.findElement(By.name("personPhone")).sendKeys("1234567890");
	driver.findElement(By.name("company")).sendKeys("Testyantra");
	driver.findElement(By.xpath("//button[text()='Submit']")).submit();
	Thread.sleep(5000);
	driver.close();
	    
	
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
