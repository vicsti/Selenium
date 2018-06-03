import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIreFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke the browser by a .exe file
		//properties defined by selenium, which holds the 
		//webdriver.chrome.driver
		//webdriver.gecko.driver
		//webdriver.ie.driver
		
		//For FireFox
		System.setProperty("webdriver.gecko.driver", "C:\\work\\firefoxdriver_win64\\geckodriver.exe");
		
		//create a drive object -- First step in selenium
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		

	}

}
