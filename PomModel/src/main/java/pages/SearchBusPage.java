package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.TestBase;

public class SearchBusPage extends TestBase {
	public String date = "26-Sep 2020";

	@FindBy(xpath ="//input[@id='src']")
	public static WebElement from;

	@FindBy(xpath = "//*[@id='search']/div/div[1]/div/ul/li")
	public static List<WebElement> listFrom;

	@FindBy(xpath =" //input[@id='dest']")
	public static WebElement to;

	@FindBy(xpath = "//*[@id='search']/div/div[2]/div/ul")
	public static List<WebElement> listTo;

	@FindBy(xpath ="//div[@class='fl search-box date-box gtm-onwardCalendar']/descendant::span")
	public static WebElement onwardCalendar;

	@FindBy(xpath =" //input[@id='return_cal']")
	public static WebElement returnDate;

	@FindBy(xpath = "//button[@id='search_btn']")
	public static WebElement search_btn;

	// this is a constructor
	public SearchBusPage() throws Exception {
		PageFactory.initElements(driver, this); //'this' means this class, we can also say "searchBusPage.class"
	}

	public ResultPage searchDetails() throws Exception
	{
		//FROM
		TimeUnit.SECONDS.sleep(5);
		from.sendKeys("Goa");
		TimeUnit.SECONDS.sleep(3);
		List<WebElement> fromBox = listFrom;
		TimeUnit.SECONDS.sleep(3);
		PageFactory.initElements(driver, this);
		driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		
		//TO
		TimeUnit.SECONDS.sleep(5);

		to.sendKeys("mumbai");
		TimeUnit.SECONDS.sleep(5);
		List<WebElement> toBox = listTo;
		TimeUnit.SECONDS.sleep(3);
		for (WebElement el : toBox) {	
			TimeUnit.SECONDS.sleep(5);
			if (el.getText().equalsIgnoreCase("Mumbai, Maharashtra, India")) {
				TimeUnit.SECONDS.sleep(5);
				driver.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
			}
		}
		//CALENDAR
		TimeUnit.SECONDS.sleep(3);
		String splitter[] = date.split("-");
		String month_year = splitter[1];
		String day = splitter[0];	
		System.out.println(month_year);
		System.out.println(day);

		onwardCalendar.click();
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


		}
		return new ResultPage(); //returns the result page object


	}

}
