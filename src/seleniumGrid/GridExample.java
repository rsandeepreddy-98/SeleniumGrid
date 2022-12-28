package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {

	@Test
	public void gridDemo() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444"), caps);
		driver.get("https://www.google.com");
		String titleOfPage = driver.getTitle();
		System.out.println("Title : " +titleOfPage);
		driver.getCurrentUrl();
		driver.close();
	}
}
