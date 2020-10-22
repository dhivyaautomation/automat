package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws Exception
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("E:\\Eclipse_programs\\PomModel\\src\\main\\java\\config\\config.properties");
		prop.load(ip);
	}
	
	public static void initialisation()
	{
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_programs\\Selenium_Working_Examples\\src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if  (browserName.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.firefox.driver", "E:\\Eclipse_programs\\Selenium_Working_Examples\\src\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
}

