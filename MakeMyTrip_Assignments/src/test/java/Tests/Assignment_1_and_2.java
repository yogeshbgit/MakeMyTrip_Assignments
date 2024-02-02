package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import Resources.BaseRepository;

public class Assignment_1_and_2 extends BaseRepository {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initialize();
	}
	
	@Test(priority=0)
	public void validateTitle()
	{
		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test(priority=1)
	public void validateURL()
	{
		String expectedURL=url;
		String actualURL = driver.getCurrentUrl();
		System.out.println("expected:"+expectedURL);
		System.out.println("actual:"+actualURL);
		Assert.assertEquals(expectedURL, actualURL);
	}

	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
