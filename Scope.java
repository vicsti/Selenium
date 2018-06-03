import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//1. find the number of links on the page
		int hrefCount = driver.findElements(By.cssSelector("a[href*=\"http\"")).size();
		System.out.println("The number1 of links are "+hrefCount);
		hrefCount = driver.findElements(By.tagName("a")).size();
		System.out.println("The number2 of links are "+hrefCount);
		
		//2. Limiting the scope of the driver to a specific part of the window.
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		hrefCount = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("The number3 of links are "+hrefCount);
		
		//3. Create one sub scope under footerDriver
		WebElement subDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		hrefCount = subDriver.findElements(By.tagName("a")).size();
		System.out.println("The number4 of links are "+hrefCount);
		Actions a = new Actions(driver);
		
		//4. Click on all the links in the subDriver scope
		for (int i=1; i < hrefCount; i++) {
			//subDriver.findElements(By.tagName("a")).get(i).click();
			//driver.switchTo().defaultContent();
			//driver.navigate().back();
			//String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			a.keyDown(Keys.CONTROL).click(subDriver.findElements(By.tagName("a")).get(i)).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();;
			//WebDriverWait wait = new WebDriverWait(driver, 15);
			//wait.until(ExpectedConditions.visibilityOfAllElements(footerDriver));
			Thread.sleep(5000L);
			
		}
		
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		
		while(it.hasNext()) {
			String current=it.next();
			System.out.println(driver.switchTo().window(current).getTitle());
		}
		
		driver.switchTo().defaultContent(); 
		
		driver.quit();
		

	}

}
