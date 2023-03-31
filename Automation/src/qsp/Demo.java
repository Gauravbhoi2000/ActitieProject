package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://tinder.com/");
	Thread.sleep(5000);
	driver.quit();
	
}
}
