import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke the browser by a .exe file
		//properties defined by selenium, which holds the 
		//webdriver.chrome.driver
		//webdriver.gecko.driver
		//webdriver.ie.driver
		
		//For FireFox
		System.setProperty("webdriver.ie.driver", "C:\\work\\IEdriver_win64\\MicrosoftWebDriver.exe");
		
		//create a drive object -- First step in selenium
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

	}

}
