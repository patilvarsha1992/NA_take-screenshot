package TakeScreenShot;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(CustomListener.class)
public class ScreenShotTest extends Base{
	@BeforeTest
	public void setUp(){
		initialization();
		
	}
	
	@Test
	public void takeScreenShot1(){
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void takeScreenShot2(){
		Assert.assertEquals(true, false);
	}
	@Test
	public void takeScreenShot3(){
		Assert.assertEquals(true, false);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
