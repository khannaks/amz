package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper{
	
	public WebDriverWait getWebDriverWait (WebDriver d, int time) {
		return new WebDriverWait(d, Duration.ofSeconds(time));
	}
	
	public void currentThreadSleep(long millis) {
		try {
			Thread.sleep(millis);
		}catch (InterruptedException e) {
			System.out.print(e);
		}
	}
	
}
