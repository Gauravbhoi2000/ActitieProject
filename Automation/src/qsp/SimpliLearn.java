package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpliLearn {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.edureka.co/corporate-training");
Thread.sleep(3000);
driver.findElement(By.name("first_name")).sendKeys("qspiders");
driver.findElement(By.name("organization")).sendKeys("Testyantra");
driver.findElement(By.name("email")).sendKeys("qspiders@gmail.com");
driver.findElement(By.name("phone")).sendKeys("1234567890");
driver.findElement(By.name("query")).sendKeys("job dedo");

Thread.sleep(3000);
WebElement element = driver.findElement(By.id("learnerCount"));
Select s=new Select(element);
s.selectByVisibleText("For Myself");

driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).submit();
Thread.sleep(5000);
driver.close();

}
}
