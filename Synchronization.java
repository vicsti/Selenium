import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		
		driver.findElement(By.cssSelector("span.tab-label")).click();
		driver.findElement(By.cssSelector("input#hotel-destination")).sendKeys("nyc");
		driver.findElement(By.cssSelector("input#hotel-destination")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,\"Amsterdam\")]")));
		
		driver.findElement(By.xpath("//a[contains(@href,\"Amsterdam\")]")).click();
		
		//driver.findElement(By.cssSelector("a.flex-link")).click();
		
		

	}

}
