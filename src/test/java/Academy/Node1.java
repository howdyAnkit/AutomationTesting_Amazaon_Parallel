package Academy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {
  @Test
  public void f() {
		WebDriver driver;
		String nodeUrl;
		
		try {
			nodeUrl = "http://<your AWS ID>/wd/hub";	//Enter your AWS ID to run into GRID or you can enter your local port number of GRID
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.get("http://amazon.in");
			driver.findElement(By.linkText("Today's Deals")).click();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	
  }
}
