import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String month = "dec";
		String year = "2019";
		String day = "10";
		Boolean found = false;
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		
		//Click on the date box
		driver.findElement(By.id("travel_date")).click();
		
		//Limit the scope to the date selecting popup
		WebElement dateDriver = driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]/parent::div[1]"));
		
		
		//Select the year
		dateDriver.findElement(By.xpath("//th[@class=\"datepicker-switch\"]")).click();
		dateDriver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[2]")).click();
		
		//Get the list of years
		int Countyears = dateDriver.findElements(By.xpath("//div[@class=\"datepicker-years\"]/table/tbody/tr/td/span")).size();
		System.out.println("The Countyears :"+Countyears);
		//Make the month selection
		for (int i=0; i<Countyears; i++ ) {
			if (dateDriver.findElements(By.xpath("//div[@class=\"datepicker-years\"]/table/tbody/tr/td/span")).get(i).getText().equalsIgnoreCase(year)) {
				dateDriver.findElements(By.xpath("//div[@class=\"datepicker-years\"]/table/tbody/tr/td/span")).get(i).click();
				
			}
		}
		
		
		
		//Get the list of Months
		int Countmonths = dateDriver.findElements(By.xpath("//div[@class=\"datepicker-months\"]/table/tbody/tr/td/span")).size();
		System.out.println("The Countmonths :"+Countmonths);
		//Make the month selection
		for (int i=0; i<Countmonths; i++ ) {
			if (dateDriver.findElements(By.xpath("//div[@class=\"datepicker-months\"]/table/tbody/tr/td/span")).get(i).getText().equalsIgnoreCase(month)) {
				dateDriver.findElements(By.xpath("//div[@class=\"datepicker-months\"]/table/tbody/tr/td/span")).get(i).click();
				
			}
		}
		 
		//Get the day's list
		List<WebElement> dayDriver = dateDriver.findElements(By.xpath("//div[@class=\"datepicker-days\"]/table/tbody/tr"));
		Iterator<WebElement> it = dayDriver.iterator();
		while(it.hasNext()) {
			WebElement ref = it.next();
			int totalDays = ref.findElements(By.tagName("td")).size();
		
		System.out.println("The totalDays :"+totalDays);
		//Make the month selection
		for (int i=0; i<totalDays; i++ ) {
			if (ref.findElements(By.tagName("td")).get(i).getText().equalsIgnoreCase(day)) {
				ref.findElements(By.tagName("td")).get(i).click();
				found = true;
				break;
				
			}
		}
		if (found)
			break;
		}
	}

}
