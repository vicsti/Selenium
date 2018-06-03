import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("Chrome");
	    dc.setPlatform(Platform.WINDOWS);
	    
	    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

	}

}
