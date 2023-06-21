package step_definitions.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CustomerHomePage_Page;
import pages.CustomerLogin_Page;
import pages.Landing_Page;
import io.cucumber.datatable.DataTable;

public class StepDefs_CustomerOrder extends Base {
	@Given("I logged in as Customer")
	public void i_logged_in_as_Customer_with_and(DataTable dataTable) {
		String welcomeMsg = CustomerLogin_Page.loginAsCustomer(dataTable.cell(1, 0), dataTable.cell(1, 1));
		assertEquals("Welcome David" , welcomeMsg);
	}

	@When("Click on Order List Menu")
	public void click_on_Order_List_Menu() {
	    click(CustomerHomePage_Page.menuOrderlist);
	}

	@When("Verify Total Order count is greater than {int}")
	public void verify_Total_Order_count_is_greater_than(Integer maxCount) {
		int totalOrderCount = getTotalElementsCount(CustomerHomePage_Page.tableRowsOrderlist );             
	    assertTrue(totalOrderCount > maxCount);
	}


}
