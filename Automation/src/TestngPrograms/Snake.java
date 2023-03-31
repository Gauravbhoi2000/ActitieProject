package TestngPrograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerDesiging.class)
public class Snake extends Baseclass {
	
	@Test
	public void rat() {
		Assert.fail();
		Reporter.log("Snake has swollen the rat",true);
	}
	@Test
	public void cat() {
		Assert.fail();
		Reporter.log("Snake has swollen the rat",true);
	}
	

}
