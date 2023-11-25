package AmazonSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.WaitHelper;

public class SignUp{
	
	public void demoSignUp(WebDriver d, WaitHelper wait) {
		
		By signUpButton = By.xpath("//*[@id=\"createAccountSubmit\"]");
		// click on the sign up button
		d.findElement(signUpButton).click();
		
		// fill the signUp form
		d.findElement(By.id("ap_customer_name")).sendKeys("Akshay Khanna");
		d.findElement(By.id("ap_phone_number")).sendKeys("9988776655");
		d.findElement(By.id("ap_email")).sendKeys("khannaks@amazon.com");
		d.findElement(By.id("ap_password")).sendKeys("khanna@123");
		
		System.out.print("Demo of signup page completed");
		wait.currentThreadSleep(2000);
		d.navigate().back();
		
	}
	
}