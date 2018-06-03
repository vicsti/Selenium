import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke the browser by a .exe file
		//properties defined by selenium, which holds the 
		//webdriver.chrome.driver
		//webdriver.gecko.driver
		//webdriver.ie.driver
		
		//For Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		//For FireFox
		//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		
		//create a drive object -- First step in selenium
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); //gets the title of the page
		
		System.out.println(driver.getCurrentUrl()); //gets the current url
		
		//System.out.println(driver.getPageSource()); //Prints the Page source
		
		driver.get("http://twitter.com");
		
		driver.navigate().back();  //clicks on the back button
		driver.navigate().forward();  // click on the fw button
		driver.close(); //closes the current browser
		
		//driver.quit(); //closes all the browsers opened by selenium script. Closes all child windows
		
		
		
		

	}

}
