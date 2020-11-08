package Academy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2 {
  @Test
  public void f() {
		WebDriver driver;
		String nodeUrl;
	  
	  try {
			nodeUrl = "http://192.168.0.100:4444/wd/hub";
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.get("http://www.yatra.com");
			System.out.println("The title is: " + driver.getTitle());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
  }
}
