package AmazonSel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.WaitHelper;

public class Cart{
	
	public void cartNavigation(WebDriver d, WaitHelper wait) {
		//checking for add to cart button
		By addToCartButton = By.id("add-to-cart-button");
		d.findElement(addToCartButton);
		System.out.println("found add cart button");
		
		// click on open cart
	    d.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	}
	
	public void buyUserFlow(WebDriver d, WaitHelper wait) {
		// click on Proceed to buy button
		d.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		
		// click on Use this address button
		d.findElement(By.xpath("//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")).click();
		
	}
}