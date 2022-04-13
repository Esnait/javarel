package saringo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import polango.Driver;
import varlango.URL;

public class TestTest {

	public static WebDriver driver;
	public String Currtitle;
 
  @BeforeTest
  public void launchbrowser() {
	  Driver chromedriver = new Driver();
	  driver = chromedriver.chrome();
	  URL homeurl = new URL(driver);
  }
  
  @Test(priority = 1)
  public void MMT_TS01_TC001_URLTest() {
	  
	  Currtitle = URL.MMT_TS01_TC001_URL();
	  
	  Assert.assertEquals(Currtitle, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	  System.out.println("MakeMyTrip homepage is launched");
  }

  @Test(priority = 2)
  public void MMT_TS02_TC001_HomePageTest() {
 
		Assert.assertEquals(true, URL.MMT_TS02_TC001_HomePage());
		System.out.println("Pass");
  }
  
  @AfterTest
  public void closebrowser() {
	  driver.quit();
  }
}
