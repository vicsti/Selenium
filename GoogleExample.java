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
		
		
		//By id, class, name, linktext locators
		//driver.findElement(By.id("email")).sendKeys("svictor.titus@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("S1mple4!@#");
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		
		//By xPath locator
		/*driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("svictor.titus@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("S1mple4!@#");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click(); */
		
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
