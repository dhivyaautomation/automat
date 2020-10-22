package Appium_Emulator_programs.src.Android;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Amazon {

		@SuppressWarnings("rawtypes")
		private static AndroidDriver driver;
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) throws MalformedURLException, InterruptedException, FileNotFoundException {

			/*
			 * File classpathRoot = new File(System.getProperty("user.dir")); 
			 File appDir = new File(classpathRoot, "src\Appium_Emulator_programs.src.Android\
			 ");
			 */
			 
			File app = new File("F:\\Appium\\AppiumWorkspace\\ProjectOne\\src"
					+ "\\Appium_Emulator_programs\\src\\Android\\in.amazon.mShop.android.shopping.apk");

			//This is a default options setup where we can define the cpapabilities and start testing from then onwards
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "emulator");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(200000);
			//driver.findElement(By.className("android.widget.Button")).click();
			Thread.sleep(15000);
			//driver.findElement(By.name("Sign up")).click();
			Thread.sleep(5000);
			
			Thread.sleep(15000);
			//driver.findElement(By.className("android.widget.LinearLayout")).click();
			//Thread.sleep(55000);
	}

}