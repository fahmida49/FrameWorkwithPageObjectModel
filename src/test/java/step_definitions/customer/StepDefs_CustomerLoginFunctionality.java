package step_definitions.customer;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLogin_Page;
import pages.Landing_Page;

public class StepDefs_CustomerLoginFunctionality extends Base{
	@Given("I am in landing page http:\\/\\/it.microtechlimited.com")
	public void i_am_in_landing_page_http_it_microtechlimited_com() {
		navigateURL(host);
	}

	@When("I Click on Login menu")
	public void i_Click_on_Login_menu() {
		click( Landing_Page.menuLogin );
	}

	@When("Click on Customer Login")
	public void click_on_Customer_Login() {
		click( CustomerLogin_Page.menuCustomerLogin );
	}

	@Then("Enter User Id as {string}")
	public void enter_User_Id_as(String userId) {
		sendkeys(CustomerLogin_Page.textBoxUserId , userId );
	}

	@Then("I Enter Password as {string}")
	public void i_Enter_Password_as(String password) {
		sendkeys(CustomerLogin_Page.textBoxPassword, password);
	}

	@Then("I Click on Login Button")
	public void i_Click_on_Login_Button() {
		click( CustomerLogin_Page.buttonCustomerLogin);
	}

	@Then("Verify that I am in CUSTOMER Home Page")
	public void verify_that_I_am_in_CUSTOMER_Home_Page() {
		String welcomeMsg =  getElementText(By.xpath("//h2[2]"));
		assertEquals("Welcome David" , welcomeMsg);
		
	}

}
