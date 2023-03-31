package TestngPrograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Chiku {
	
	@Test(priority = 2)
	public void Dhoni() {
		Assert.fail();
Reporter.log("Best Captain Ever in History",true);
		
	}

	@Test(priority = 2)
	public void Sehwag() {
		Reporter.log("Dangerous opener",true);
	}
	
	@Test(enabled = false)
	public void Ashwin() {
		Reporter.log("offspinner mankading",true);
	}

}
