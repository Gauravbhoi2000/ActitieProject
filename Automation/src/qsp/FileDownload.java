package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(3000);	
r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	
	driver.close();
}
}
