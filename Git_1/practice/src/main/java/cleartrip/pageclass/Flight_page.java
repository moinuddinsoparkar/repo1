package cleartrip.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Basic_Utility;

public class Flight_page extends Basic_Utility {

	WebDriver driver;

	public Flight_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "((//input[@class='checkbox__input o-0'])[1]")
	private WebElement nonstop_Checkbox;

	@FindBy(xpath = "//div[@data-test-attrib='onward-view']/div/div[1]")
	private WebElement from_price;

	@FindBy(xpath = "//div[@data-test-attrib='return-view']/div/div[1]")
	private WebElement to_price;

	@FindBy(xpath = "//button/span[contains(text(),'Book now')]")
	private WebElement bookNow_Btn;

	public void selectBookFlight() {
//		select check box for non-stop flight
		clickOnElement(nonstop_Checkbox);
		
//		selecting lower ticket price and book for the same
		clickOnElement(from_price);
		clickOnElement(to_price);
		clickOnElement(bookNow_Btn);
	}

}
