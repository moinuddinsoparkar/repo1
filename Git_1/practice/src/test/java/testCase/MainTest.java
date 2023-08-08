package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cleartrip.pageclass.Flight_page;
import cleartrip.pageclass.Home_page;
import utility.Basic_Utility;

public class MainTest extends Basic_Utility {
	static WebDriver driver;
	Home_page hp = null;
	Flight_page fp = null;

	@BeforeMethod
	public void setUp() {
//		setting up driver and launch url by calling setup method from utility
		driver = setUp("chrome", "https://www.cleartrip.com");

//		initialize the pom class object 
		hp = new Home_page(driver);
		fp = new Flight_page(driver);
	}

	@Test
	public void Select_Flight() throws InterruptedException {

//		calling selectflight method from home_page
		System.out.println("before select flight");
		hp.selectFligt();
		System.out.println("after select flight");

//		calling selectFlightAndPassengers method from home_page	
		System.out.println("before selectFlightAndPassengers");
		hp.selectFlightAndPassengers();
		System.out.println("after selectFlightAndPassengers");

//		calling select_Destinatio method from home_page	
		System.out.println("before select_Destination");
		hp.select_Destination();
		System.out.println("after select_Destination");

//		calling select_Date method from home_page	
		System.out.println("before select_Date");
		hp.select_Date();
		System.out.println("after select_Date");

//		calling selectBookFlight from flight_page
		System.out.println("before selectBookFlight");
		fp.selectBookFlight();
		System.out.println("after selectBookFlight");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
