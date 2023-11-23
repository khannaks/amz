package Program;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		//WebElement signInElement = d.findElement(By.xpath("//input[@id=\"nav-link-accountList-nav-line-1\"]"));
//signInElement.click();
		String url=d.getCurrentUrl();
		if(url.equals("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"))
		{System.out.println("Test case Passed!");
		}
		else {
			System.out.println("Test case Failed");
		}
		d.findElement(By.id("ap_email")).sendKeys("khannaks@amazon.com");
		d.findElement(By.id("continue")).click();
		d.findElement(By.id("ap_password")).sendKeys("TEST2023AKSHAY");
		d.findElement(By.id("signInSubmit")).click();
//		String homepage=d.getCurrentUrl();
//		if(homepage.equals("https://www.amazon.in/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&signIn=1&useRedirectOnSuccess=1&action=sign-out&ref_=nav_AccountFlyout_signout"))
//		{System.out.println("Test case Passed! - Login successfull- Homepage opened");
//		}
//		else {
//			System.out.println("Test case Failed!");
//		}
		boolean isDisplayed = d.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
        System.out.println(isDisplayed);		
        d.findElement(By.id("twotabsearchtextbox")).sendKeys("Galaxy S23 FE 5G (Purple, 8GB, 128GB Storage)");
        d.findElement(By.id("nav-search-submit-button")).click();
        d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
//Switch window No exception found
       // d.switchTo().newWindow(WindowType.TAB);
        //d.get("https://www.amazon.in/Samsung-Galaxy-Purple-128GB-Storage/dp/B0CJ4TFLTT/ref=sr_1_2?crid=3GXM71NL80K9P&keywords=Galaxy+S23+FE+5G+%28Purple%2C+8GB%2C+128GB+Storage%29&nsdOptOutParam=true&qid=1700562247&sprefix=galaxy+s23+fe+5g+purple%2C+8gb%2C+128gb+storage+%2Caps%2C279&sr=8-2");
        Set<String> set = d.getWindowHandles();
        ArrayList ar = new ArrayList(set);
        d.switchTo().window((String)ar.get(1));
        d.findElement(By.xpath("//*[@id=\"submit.add-to-cart\"]")).click();
       d.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	}

}
