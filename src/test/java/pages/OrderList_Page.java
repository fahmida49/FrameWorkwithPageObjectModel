package pages;

import org.openqa.selenium.By;

public class OrderList_Page {
	//locators
	 public static By orders = By.xpath("//tr");
	 public static By lastOrder = By.xpath("//tr[last()]");
	 public static By lastColumn = By.xpath(".//td[last()]/a");
}
