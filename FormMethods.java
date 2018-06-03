import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://makemytrip.com");
		
		//driver.switchTo().alert().dismiss();
		
		//driver.findElement(By.xpath("//div[@class=\"hp-widget-top\"]/div/div[3]")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("button#addModifyBtn")).isDisplayed());
		
		//driver.findElement(By.cssSelector("input#hp-widget__paxCounter_pot")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("button#addModifyBtn")).isDisplayed());	
		
		System.out.println(driver.findElement(By.xpath("//li[@id=\"js-dt__tags_63\"]")).getText());
		
	}

}
