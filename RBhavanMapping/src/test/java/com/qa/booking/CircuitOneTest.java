package com.qa.booking;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.RpBhavanObjects;
import testbase.BaseTest;
import utils.TestUtil;

public class CircuitOneTest extends BaseTest{

	private static String APP_URL= "https://rb.nic.in/rbvisit/visit_plan.aspx";
	RpBhavanObjects pageobj = new RpBhavanObjects();

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get(APP_URL);
	}

	@Test
	public void BookCircuitTest() {

		pageobj.btnCircuit1(driver).click();
		pageobj.btnClickForOnlineBooking(driver).click();
		pageobj.uiDatepickerTrigger(driver).click();
		new Select(pageobj.uiDatePickerYear(driver)).selectByVisibleText("2023");
		new Select(pageobj.uiDatePickerMonth(driver)).selectByVisibleText("Jan");
		new TestUtil().takeElementScreenshot(pageobj.uiDatePickerDiv(driver));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
