package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin 
{
	WebDriver driver;
	@BeforeTest
	public void setUpChrome()
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumBackups\\Chromedriver83\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
