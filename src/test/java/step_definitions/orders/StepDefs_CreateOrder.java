package step_definitions.orders;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import io.cucumber.java.en.Then;
import pages.CustomerHomePage_Page;
import pages.OrderList_Page;
import pages.OrderProduct_Page;

public class StepDefs_CreateOrder extends Base {
	@Then("I click on Order Product menu")
	public void i_click_on_Order_Product_menu() {
	    click( CustomerHomePage_Page.menuOrderProduct );
	}

	@Then("Select Product name")
	public void select_Product_name() {
		selectDropDownMenu( OrderProduct_Page.dropDownProductName, "Camera" );
	}

	@Then("Enter Order Date")
	public void enter_Order_Date() {
	    sendkeys(OrderProduct_Page.textBoxOrderDate, "05/14/2023");
	}

	@Then("Click Order Product button")
	public void click_Order_Product_button() {
	    click( OrderProduct_Page.buttonOrderProduct );
	}

	@Then("Click Confirm Order")
	public void click_Confirm_Order() throws InterruptedException {
		WebElement lastOrder = driver.findElement( OrderList_Page.lastOrder );
		lastOrder.findElement( OrderList_Page.lastColumn ).click();
		Thread.sleep(3000);
	}

	@Then("Verify Order Status is Confirmed")
	public void verify_Order_Status_is_Confirmed() {
		//WebElement lastOrder = driver.findElement( OrderList_Page.lastOrder );
		String orderStatus = getElementText( By.xpath("//tr[last()]/td[6]") );
		assertEquals("Confirmed", orderStatus);
	}

}
