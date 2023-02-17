package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.NavigateToPage;
import pages.TestBase;

public class SkyBlueBgStep extends TestBase {

	NavigateToPage navToPage;

	@Before
	public void beforeRun() throws InterruptedException {
		initDriver();
		navToPage = PageFactory.initElements(driver, NavigateToPage.class);
		driver.get("https://techfios.com/test/102/");

	}

	@Given("{string} button exists")
	public void btnExists(String btn) {
		if (btn.equals("Set SkyBlue Background"))
			Assert.assertTrue(navToPage.blueBtnExists());
		else if (btn.equals("Set SkyWhite Background"))
			Assert.assertTrue(navToPage.whiteBtnExists());
	}

	@When("I click on the {string}")
	public void set_skyblue(String btn) {
		if (btn.equals("Set SkyBluebutton")) {
			navToPage.clickOnSkyBlue();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else if (btn.equals("Set White button")) {
			navToPage.clickOnWhite();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Then("The background color will change to {string}")
	public void bgColorChangedToBlue(String bgColor) {

		if (bgColor.equals("sky blue")) {
			Assert.assertEquals("background-color: skyblue;", navToPage.validateBlueBodyColor());
			navToPage.validateBlueBodyColor();
		} else if (bgColor.equals("white")) {
			Assert.assertEquals("background-color: white;", navToPage.validateWhiteBodyColor());
			navToPage.validateWhiteBodyColor();
		}
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
