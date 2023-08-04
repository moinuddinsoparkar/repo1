package cleartrip.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class Home_page extends BaseClass {

	WebDriver driver;

	public Home_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul/li[@class='bg-secondary-100 br-6']/a")
	private WebElement flight_Btn;

	@FindBy(xpath = "//div[@class='p-relative']/button")
	private WebElement drop_Btn;

	@FindBy(xpath = "//ul/li[@value='rt']")
	private WebElement typeOfTrip_dropdown;

	@FindBy(xpath = "//div[@class='p-relative br-4']/button")
	private WebElement typeOfPassenger_dropdown;

	@FindBy(xpath = "(//div[@value='travellerAndClass']//ul[@class='ls-reset flex flex-middle noselect'])[1]/li[2]")
	private WebElement adultPassenger_txt;

	@FindBy(xpath = "(//div[@value='travellerAndClass']//ul[@class='ls-reset flex flex-middle noselect'])[1]/li[3]")
	private WebElement adultPassenger_increment;

	@FindBy(xpath = "(//div[@value='travellerAndClass']//ul[@class='ls-reset flex flex-middle noselect'])[2]/li[2]")
	private WebElement ChildPassenger_txt;

	@FindBy(xpath = "(//div[@value='travellerAndClass']//ul[@class='ls-reset flex flex-middle noselect'])[2]/li[3]")
	private WebElement ChildPassenger_increment;

	@FindBy(xpath = "//div[contains(text(),'Economy')]")
	private WebElement economy_btn;

	@FindBy(xpath = "//div[contains(text(),'Regular fare')]")
	private WebElement regularFare_btn;

	@FindBy(xpath = "//input[@placeholder='Where from?']")
	private WebElement from_Dropdown;

	@FindBy(xpath = "//div[contains(text(),'BLR')]")
	private WebElement from_Destination;

	@FindBy(xpath = "//input[@placeholder='Where to?']")
	private WebElement to_Dropdown;

	@FindBy(xpath = "//div[contains(text(),'HYD')]")
	private WebElement to_Destination;

	@FindBy(xpath = "//div[@class='flex flex-middle p-relative homeCalender']/button[1]")
	private WebElement from_dateBtn;

	@FindBy(xpath = "//div[contains(@aria-label,'Aug 18 2023')]")
	private WebElement from_Date;

	@FindBy(xpath = "//div[@class='flex flex-middle p-relative homeCalender']/button[2]")
	private WebElement to_dateBtn;

	@FindBy(xpath = "//div[contains(@aria-label,'Aug 19 2023')]")
	private WebElement to_Date;

	@FindBy(xpath = "//div/span[@class='fw-600 fs-4 lh-2 flex flex-middle']")
	private WebElement search_btn;

	public void selectFligt() {
//		selecting the flight option 
		clickOnElement(flight_Btn);
	}

	public void selectFlightAndPassengers() {
//		click on drop drop and select round trip option
		clickOnElement(drop_Btn);
		clickOnElement(typeOfTrip_dropdown);
		
//		select 1 adult and 1 child as a passengers in economy class
		clickOnElement(typeOfPassenger_dropdown);
		clickOnElement(ChildPassenger_increment);
		clickOnElement(economy_btn);
	}

	public void select_Destination() {
//		selecting the from and to destination example benglore to hyderabad
		selectDestination(from_Dropdown, from_Destination);
		selectDestination(to_Dropdown, to_Destination);
	}

	public void select_Date() {
//		select the date for travelling and serach for the same
		selectDate(from_dateBtn, from_Date);
		selectDate(to_dateBtn, to_Date);
		clickOnElement(search_btn);
	}

}
