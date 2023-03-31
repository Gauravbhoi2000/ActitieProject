package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver  mumbai=new ChromeDriver();
		 Thread.sleep(5000);
		mumbai.manage().window().maximize();
		mumbai.get("https://www.instagram.com/");

		
		 Thread.sleep(5000);
	
	} 

}
