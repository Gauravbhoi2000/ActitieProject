package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		
		int xaxis = driver.findElement(By.xpath("//input[@class='sc-hdPSEv tDCny']")).getLocation().getX();
	int yaxis = driver.findElement(By.xpath("//input[@class='sc-hdPSEv tDCny']")).getLocation().getY();
	System.out.println(xaxis);
	System.out.println(yaxis);
	Thread.sleep(3000);
	driver.close();
	}
	

}
