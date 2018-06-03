import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
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
		
		driver.get("http://rediff.com");
		
		
		//By using xPath regular expression
		driver.findElement(By.cssSelector("a[title*=\"Sign in\"]")).click();;
		driver.findElement(By.xpath("//input[contains(@name,\"log\"]")).sendKeys("kajkd");
		driver.findElement(By.xpath("//input[contains(@name,\"passw\"]")).sendKeys("kajkd");
		driver.findElement(By.xpath("//input[contains(@name,\"proc\"]")).click();
		
		

		
		
		
		

	}

}
