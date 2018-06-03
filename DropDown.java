import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]")));
		sel.selectByValue("AED");
		sel.selectByIndex(0);
		sel.selectByVisibleText("USD");
		
		//driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		//driver.findElement(By.linkText("Agartala (IXA)")).click();
		//driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		
		//driver.findElement(By.xpath("(//a[@value=\"IXA\"])")).click();
		//driver.findElement(By.xpath("(//a[@value=\"BLR\"])[2]")).click(); //this does not make the BLR selection on the "TO" destination
		
		if(!driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected()) {
			driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		}
		
	}

}
