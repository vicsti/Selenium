import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaQuickAcademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//For Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		//For FireFox
		//System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		
		//create a drive object -- First step in selenium
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com");
		System.out.println(driver.getTitle()); //gets the title of the page
		
		System.out.println(driver.getCurrentUrl()); //gets the current url
		
		//System.out.println(driver.getPageSource()); //Prints the Page source
		
		driver.findElement(By.linkText("Interview Guide")).click();
		
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]")).click();
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[3]")).click();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		
		//Click on the tab with the text
		driver.findElement(By.xpath("//*[text()=\" Selenium \"]")).click();
		
		//traverse back to the parent from child
		//driver.findElement(By.xpath("//button[@class=\"navbar-toggle\"]/parent::div")).click();
		
		
				

		
		
		
		

	}

}
