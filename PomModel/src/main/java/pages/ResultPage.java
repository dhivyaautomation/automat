package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class ResultPage extends TestBase {

	@FindBy(xpath="//div[@class='button view-seats fr' and contains(text(),'View Seats')]")
	public WebElement viewSeat;
	
	
	@FindBy(xpath="//*[@id='12629803']/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/ul/li[1]/div[1]/div")
	public WebElement boardingpoint;
	
	@FindBy(xpath="//*[@id='12629803']/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/ul/li[1]/div[1]/div")
	public WebElement droppingPoint;
	
	@FindBy(xpath="//div[@class='continue-container w-100 fl m-b-10']/button")
	public WebElement proceedToBook_Btn;
	
	


public ResultPage()  throws Exception 
{
	PageFactory.initElements(driver, this);
}

public PassengerDetails selectSeat() throws Exception
{
	TimeUnit.SECONDS.sleep(5);
	viewSeat.click();
	TimeUnit.SECONDS.sleep(10);
	 WebElement element = driver.findElement(By.xpath("//div/descendant::div[172]"));
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();", element);
	

	 Thread.sleep(3000);

	TimeUnit.SECONDS.sleep(5);
	WebElement el = driver.findElement(By.xpath("//li/descendant::div[195]"));
	 JavascriptExecutor exec = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();", el);
	

	TimeUnit.SECONDS.sleep(5);
	proceedToBook_Btn.click();
	TimeUnit.SECONDS.sleep(5);
	return new PassengerDetails();	
}

public void seatCheck()
{
	System.out.println("seat has been selected");
}
	
}


