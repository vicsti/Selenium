import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		if(!driver.findElement(By.xpath("//input[@value=\"Butter\"]")).isEnabled()) {
		
		driver.findElement(By.xpath("//input[@value=\"Butter\"]")).click();
		}
		
		System.out.println(driver.findElements(By.xpath("//input[@name=\"group1\"]")).size());
		int count=driver.findElements(By.xpath("//input[@name=\"group1\"]")).size();
		
		for (int i=0; i<count; i++) {
			if (driver.findElements(By.xpath("//input[@name=\"group1\"]")).get(i).getAttribute("value").equalsIgnoreCase("cheese")) {
			driver.findElements(By.xpath("//input[@name=\"group1\"]")).get(i).click();
			}
		}
		

		
	}

}
