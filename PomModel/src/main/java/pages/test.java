package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
static WebDriver driver;
static String date = "25-Sep 2020";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_programs\\Selenium_Working_Examples\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.com");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("goa");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("mumbai");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
		TimeUnit.SECONDS.sleep(3);
		String splitter[] = date.split("-");
		String month_year = splitter[1];
		String day = splitter[0];	
		System.out.println(month_year);
		System.out.println(day);

		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']/descendant::span")).click();
		TimeUnit.SECONDS.sleep(5);
		//driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
		TimeUnit.SECONDS.sleep(10);
		for (int i=0; i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			//Selecting the month
			if(elements.get(i).getText().equals(month_year))
			{				
				//Selecting the date				
				List<WebElement> days = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
				//System.out.println(days.toString());
				TimeUnit.SECONDS.sleep(3);

				for (WebElement d:days)
				{					
					System.out.println(d.getText());
					if(d.getText().equals(day))
					{
						d.click();
						Thread.sleep(10000);
						//return;
					}
				}								

			}				
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='search_btn']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='button view-seats fr']")).click();
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath("//*[@id=\"10906393\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/ul/li[1]/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"10906393\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/ul/li[1]/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='continue-container w-100 fl m-b-10']/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/descendant::div[@id=\"div_22_0\"]")).click();
			//driver.quit();


		}
	}

}


