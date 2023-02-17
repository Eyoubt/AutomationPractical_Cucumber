package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavigateToPage {

	WebDriver driver;

	public NavigateToPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.CSS, using = "button[type='button'][onclick='myFunctionSky()']")
	WebElement blueBgBtn;

	@FindBy(how = How.CSS, using = "button[type='button'][onclick='myFunctionWhite()']")
	WebElement whiteBgBtn;

	@FindBy(how = How.TAG_NAME, using = "body")
	WebElement whiteBgBody;

	@FindBy(how = How.TAG_NAME, using = "body")
	WebElement blueBgBody;

	public boolean blueBtnExists() {
		return blueBgBtn.isDisplayed();
	}

	public boolean whiteBtnExists() {
		return whiteBgBtn.isDisplayed();
	}

	public void clickOnSkyBlue() {
		blueBgBtn.click();
	}

	public void clickOnWhite() {
		whiteBgBtn.click();
	}

	public String validateBlueBodyColor() {

		String domAttr = blueBgBody.getDomAttribute("style");
		System.out.println(domAttr);
		return domAttr;
	}

	public String validateWhiteBodyColor() {

		String domAttr = whiteBgBody.getDomAttribute("style");
		System.out.println(domAttr);
		return domAttr;

	}

}
