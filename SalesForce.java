import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

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
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("svictor.titus@gmail.com");
		
		
		driver.findElement(By.name("pw")).sendKeys("wrwrw");
		
		//driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
		
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		

		
		
		
		

	}

}
