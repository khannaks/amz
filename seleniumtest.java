package AmazonSel;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.WaitHelper;

public class seleniumtest {

	public static void main(String[] args) {
		WaitHelper wait = new WaitHelper();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		// Login to site
		Login login = new Login();
		login.moveToSite(d, wait);
		login.moveToLoginPage(d, wait);
		
		//demo the sign-up flow
		SignUp signup = new SignUp();
		signup.demoSignUp(d, wait);
		
		// login to site
		login.loginToSite(d, wait);
		
		wait.getWebDriverWait(d, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList-nav-line-1")));
		
		boolean isDisplayed = d.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
        System.out.println(isDisplayed);	
        
        // Searching for Item
        Search search  = new Search();
        search.searchForItem(d, "Galaxy S23 FE 5G (Purple, 8GB, 128GB Storage)");
        
        // Moving to Item page
        search.clickAndMoveToItem(d, wait); 
        
        wait.currentThreadSleep(1000);
        
        // Adding item to cart
        Cart cart  = new Cart();
        cart.cartNavigation(d, wait);
        
        // Proceed to buy
        cart.buyUserFlow(d, wait);
        
        System.out.println("Testing completed");
	}

}
