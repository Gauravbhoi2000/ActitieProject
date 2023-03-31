package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Jspiders%20thane1/Desktop/rozgar.html");
		Thread.sleep(5000);
		driver.findElement(By.id("h1")).sendKeys("./Testdata/kalpana_naik.pdf");
		Thread.sleep(5000);
		driver.close();
	}

}
