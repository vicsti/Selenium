import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesorGrids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer totalruns = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18869/eng-vs-pak-2nd-test-pakistan-tour-of-england-2018");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("div[class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"]"));
		int batsmanCount = table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] div:nth-child(3)")).size();

			for (int i=0; i<batsmanCount-2 ; i++) {
				String runs = table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] div:nth-child(3)")).get(i).getText();
				System.out.println("The runs are: "+runs);
			    totalruns = Integer.parseInt(runs) + totalruns;	
				
			}
			
			System.out.println("The Total runs are: "+totalruns);
			
	
	}

}
