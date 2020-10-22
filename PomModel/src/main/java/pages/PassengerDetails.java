package pages;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.TestBase;

public class PassengerDetails extends TestBase {
	

	//PageFactory
	@FindBy(xpath = "//input[@placeholder='Name']")
	public WebElement name;

	@FindBy(xpath = "//input[@placeholder='Age']")
	public WebElement age;

	@FindBy(id="div_22_0")
	public WebElement radiobtn_Female;

	@FindBy(id="div_22_0")
	public WebElement radiobtn_Male;

	@FindBy(xpath ="//input[@placeholder='Email ID']")
	public WebElement email;

	@FindBy(xpath ="//div//descendant::input[22]")
	public WebElement phone;

	@FindBy(xpath="//*[@id='root']/div/div[4]/div[3]/div[2]/div[2]/input")
	public WebElement payBtn;

	//Constructor
	public PassengerDetails() throws Exception
	{
		PageFactory.initElements(driver, this);
	}

	//Tests
	
	public void passengerDetails(String passName,String passAge,String passGender, String passEmail,String passPhone) throws Exception
	{
		name.sendKeys(passName);
		age.sendKeys(passAge);
		if (passGender.equalsIgnoreCase("Male"))
		{
			TimeUnit.SECONDS.sleep(5);
			radiobtn_Male.click();
		}
		else if (passGender.equalsIgnoreCase("Female"))
		{
			TimeUnit.SECONDS.sleep(5);
			radiobtn_Female.click();
		}
		TimeUnit.SECONDS.sleep(3);
		email.sendKeys(passEmail);
		TimeUnit.SECONDS.sleep(3);
		phone.sendKeys(passPhone);
		}
	
	
		
		/*
		 * public boolean PassengerCheck(String passName) { String excelName = passName;
		 * System.out.println("data from excel "+excelName); String browserDataForName =
		 * name.getText(); System.out.println("data from browser "+browserDataForName);
		 * Assert.assertEquals(excelName,browserDataForName ); payBtn.click(); return
		 * true; }
		 */
		 
}
