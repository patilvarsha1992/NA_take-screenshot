package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	
	public static void initialization(){
		System.setProperty("webdriver.chrome.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://leadferret.com/login");
	}
	
	public void takeScreenShotOfFailedTest(String testMethodName ) throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("/Users/jaideo/Documents/varsha-workspace/TakeScreenShotTestNG/ScreenShots/"+testMethodName+".jpg"));
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
	

}
