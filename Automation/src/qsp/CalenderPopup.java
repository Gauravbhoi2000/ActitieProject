package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.xpath("//input[@placeholder='Policy Number']")).sendKeys("123");
		driver.findElement(By.name("dob")).click();
	WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
Select s=new Select(month);
s.selectByIndex(11);
Thread.sleep(3000);
WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select y=new Select(year);
y.selectByValue("1990");
driver.findElement(By.xpath("//a[.='15']")).click();

driver.findElement(By.id("alternative_number")).sendKeys("0123456789");
Thread.sleep(3000);
driver.close();

	
	}
	

}
