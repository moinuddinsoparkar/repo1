package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import cleartrip.pageclass.Flight_page;
import cleartrip.pageclass.Home_page;
import utility.Basic_Utility;

public class MainTest extends Basic_Utility {
	WebDriver driver;
	Home_page hp;
	Flight_page fp;

	@BeforeSuite
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
		hp.selectFligt();

//		calling selectFlightAndPassengers method from home_page	
		hp.selectFlightAndPassengers();

//		calling select_Destinatio method from home_page	
		hp.select_Destination();

//		calling select_Date method from home_page	
		hp.select_Date();

//		calling selectBookFlight from flight_page
		fp.selectBookFlight();

	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}
