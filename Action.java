import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://amazon.com/");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	 
	
	//Enter an Text in caps in search text box
	WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
	
	act.moveToElement(move).click().sendKeys(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
	//Moves to a specific element
	move = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
	act.moveToElement(move).contextClick().build().perform();
	
	
	
	
	
}
}
