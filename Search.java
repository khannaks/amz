package AmazonSel;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helper.WaitHelper;

public class Search {
	
	public void searchForItem(WebDriver d, String item) {
		//typing in the search bar
		d.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
		
		// clicking on the search button
		d.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
	public void clickAndMoveToItem(WebDriver d, WaitHelper wait) {
		// clicking on the first Item
		wait.currentThreadSleep(5000);
		By item = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span");
		
		// Waiting for element to become clickable
		wait.getWebDriverWait(d, 30).until(ExpectedConditions.elementToBeClickable(item));
		
		// clicking on item
		d.findElement(item).click();
		
		System.out.print("Item found");

		// Switching control to new item window
		Set<String> set = d.getWindowHandles();
        @SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList ar = new ArrayList(set);
        d.switchTo().window((String)ar.get(1));
	}
}