package varlango;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class URL {

	public static String Currtitle;
	static WebDriver driver;
	static WebElement popup,Menu;
	static List <Boolean> Homepage_UI;
	
	public URL(WebDriver driver) {
		this.driver = driver;
	}
	
	public static String MMT_TS01_TC001_URL() {
		Currtitle = driver.getTitle();
		return Currtitle;
	}
	
	public static List<Boolean> MMT_TS02_TC001_HomePage() {
		
		popup = driver.findElement(By.xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']"));
		
		try {
			Assert.assertEquals(true, popup.isDisplayed()); 
			System.out.println("Homepage is launched and Popup displays by default"); } 
		catch(Error e)	{System.out.println("Popup is not displayed");} 
		
		Menu = driver.findElement(By.xpath("//ul[@class='makeFlex font12']"));
		WebElement myBiz = driver.findElement(By.xpath(""));		
		WebElement MyTrips = driver.findElement(By.xpath(""));
		WebElement Login_Create = driver.findElement(By.xpath(""));
		WebElement Flights_panel = driver.findElement(By.xpath(""));
		WebElement IN_ENG_INR = driver.findElement(By.xpath(""));
		WebElement SEARCH = driver.findElement(By.xpath(""));
		WebElement Explore_More = driver.findElement(By.xpath(""));

		Homepage_UI.add(Menu.isDisplayed());
		Homepage_UI.add(myBiz.isDisplayed());
		Homepage_UI.add(MyTrips.isDisplayed());
		Homepage_UI.add(Login_Create.isDisplayed());
		Homepage_UI.add(Flights_panel.isDisplayed());
		Homepage_UI.add(IN_ENG_INR.isDisplayed());
		Homepage_UI.add(SEARCH.isDisplayed());
		Homepage_UI.add(Explore_More.isDisplayed());
		
		return Homepage_UI;
	}

}
