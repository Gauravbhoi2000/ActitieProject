package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraForXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("watch for kids");
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	String text = driver.findElement(By.xpath("(//h3[text()='Spiky'])[2]/../../div[2]/div/span[1]/span[1]")).getText();
System.out.println(text);
Thread.sleep(5000);
driver.close();

}
}
