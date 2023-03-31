package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomUtlization {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void loginToActitime() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys("admin");
		driver.navigate().refresh();
		lp.getUntbx().sendKeys("admin");
		lp.getPwtbx().sendKeys("manager");
		lp.getLgbtn().click();
	}

}
