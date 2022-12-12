package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RpBhavanObjects {

	public WebElement btnCircuit1(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='rbvisit.aspx']"));
	}
	public WebElement btnClickForOnlineBooking(WebDriver driver) {
		return driver.findElement(By.id("ContentPlaceHolder1_lnk_request"));
	}
	public WebElement uiDatepickerTrigger(WebDriver driver) {
		return driver.findElement(By.xpath("//img[@title='...']"));
	}
	public WebElement uiDatePickerYear(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	}
	public WebElement uiDatePickerMonth(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	}
	public WebElement uiDatePickerDiv(WebDriver driver) {
		return driver.findElement(By.id("ui-datepicker-div"));
	}

}
