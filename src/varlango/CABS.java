package varlango;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CABS {
	WebDriver driver;
	public static WebElement element, from, to, depature, rtn, pickup,one_way,low_high,sorted,
	sort,suv,menu,credentials,button,SortedBy,leftpanel,cabService;
	public static String url,cabTitle,search;

	CABS(WebDriver driver) {
		this.driver = driver;
	}
	
	public void MMT_TS05_TC001_CabSearch()
	{
		
		url=driver.getTitle();
		if(url.equalsIgnoreCase("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")) {
			System.out.println("Home page is verifed "+url);
		}
		
		driver.findElement(By.xpath("/html")).click();		
		
		driver.findElement(By.linkText("Cabs")).click();
		cabTitle=driver.getTitle();
		
		if(cabTitle.equalsIgnoreCase("Online Cab Booking - Book Outstation Cabs at Lowest Fare @ MakeMyTrip"))
			{
			System.out.println("Login popup is closed.");
			System.out.println("Cabs page is displayed "+cabTitle);
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		one_way=driver.findElement(By.xpath("//li[text()='OUTSTATION ONE-WAY']"));
		from=driver.findElement(By.xpath("//label[@for='fromCity']"));
		to=driver.findElement(By.id("toCity"));
		depature=driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		rtn=driver.findElement(By.xpath("//span[text()='RETURN']"));
		pickup=driver.findElement(By.xpath("//span[text()='PICKUP-TIME']"));
		
		if(one_way.isDisplayed() && from.isDisplayed() && to.isDisplayed()
				&& depature.isDisplayed() && rtn.isDisplayed() &&pickup.isDisplayed())
			
			System.out.println("OUTSTATION ONE-WAY radio button is displayed\nFROM label is displayed\nTO label is displayed"
					+ "\nDEPARTURE label is displayed\nRETURN label is displayed\nPICKUP label is displayed");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		search=driver.getTitle();
		if(search.equalsIgnoreCase("Cabs"))
			System.out.println("Search button is clicked and Redirected to cabs search page "+search);
		
		//Apperance of the cabs search page
		
		menu=driver.findElement(By.xpath("//ul[@class='makeFlex font12']"));
		credentials=driver.findElement(By.id("cabModifySearch"));
		button=driver.findElement(By.xpath("//button"));
		SortedBy=driver.findElement(By.xpath("//*[@class='blueGradientBG paddingTB24 cabSorter']"));
		leftpanel=driver.findElement(By.xpath("//*[@class='filterPanel']"));
		cabService=driver.findElement(By.xpath("//*[@class='width970']"));
		
		if(menu.isDisplayed() && credentials.isDisplayed() && button.isDisplayed()
				&& leftpanel.isDisplayed() && cabService.isDisplayed())
			
			System.out.println("Menu bar is displayed \nONE-WAY cab credentials are displayed "
					+ "\nSEARCH Button is dispalyed\nSortedBy dropdown list box is displayed"
					+ "\nLeftPanel is displayed\nCabs Service is displayed");
		
	}
}
