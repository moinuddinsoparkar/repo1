package utility;

import org.openqa.selenium.WebElement;

public class BaseClass extends Basic_Utility {

	public void selectDestination(WebElement element, WebElement option) {
		clickOnElement(element);
		clickOnElement(option);
	}

	public void selectDate(WebElement element1, WebElement element2) {
		clickOnElement(element1);
		clickOnElement(element2);
	}
}
