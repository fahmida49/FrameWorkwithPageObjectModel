package pages;

import org.openqa.selenium.By;

public class OrderProduct_Page {
	//locator
	public static By dropDownProductName = By.name("prodId");
	public static By textBoxOrderDate = By.name("ordDate");
	public static By buttonOrderProduct = By.xpath("//button[@type='submit']");
}
