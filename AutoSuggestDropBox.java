import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropBox {

	public static void main(String[] args) {
		Boolean found = true;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		
		while (found) {
		
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromPlaceName")).getText();
		
		//What is the disadvantage with selenium
		//It cannot identify hidden text's -- In example AutoSuggest
		//class="ui-helper-hidden-accessible"
		//Solution is to use Java script to extract hidden script, this can be done by JavaScript Executer
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		
		String city = js.executeScript(script).toString();
		System.out.println("THE CITY IS: "+city);
		if (city.contains("AIRPRT")) {
			found = false;
		}
		}
		}
		
		

	}


