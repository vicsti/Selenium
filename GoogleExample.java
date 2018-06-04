import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {

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
		
		driver.get("http://facebook.com");
		
		
		
		
		//By Css locator
		/*driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("hijk");
		driver.findElement(By.cssSelector("input[value=\"Log In\"]")).click(); */
		
		//By using xPath regular expression
		driver.findElement(By.xpath("//input[contains(@name,\"emai\")]")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[contains(@type,\"pass\")]")).sendKeys("kajkd");
		driver.findElement(By.xpath("//input[contains(@value,\"Log\")]")).click();
		
		

		
		
		
		

	}

}
