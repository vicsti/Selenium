import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//input[@value=\"Confirmation Alert\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("Send INFO");
		//driver.swithch().alert().dismiss();driver.switchTo().alert().getText()
		driver.switchTo().alert().accept();
		
		
	}

}
