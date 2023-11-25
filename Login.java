package AmazonSel;
import helper.WaitHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login{
	
	public void moveToSite(WebDriver d, WaitHelper wait) {
		String url = getURL();
		// GOTO amazon.in site
		wait.currentThreadSleep(2000);
		d.get(url);
	}
	
	public void moveToLoginPage(WebDriver d, WaitHelper wait) {
		// Click on Login button
		System.out.print("Moved to Login Page");
		wait.getWebDriverWait(d, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")));
		d.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		wait.currentThreadSleep(2000);
	}
	
	
	public void loginToSite(WebDriver d, WaitHelper wait) {	 
		// filling login details
		d.findElement(By.id("ap_email")).sendKeys("khannaks@amazon.com");
		d.findElement(By.id("continue")).click();
		d.findElement(By.id("ap_password")).sendKeys("TEST2023AKSHAY");
		wait.currentThreadSleep(2000);
		d.findElement(By.id("signInSubmit")).click();
		// Checking if we logged in successfully
		wait.getWebDriverWait(d,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(.,'Hello, Akshay')]")));
		
		System.out.println("Logged in successfully");
		wait.currentThreadSleep(2000);
		
		
		
	}
	
	private String getURL() {
		return "https://www.amazon.in";
	}
} 