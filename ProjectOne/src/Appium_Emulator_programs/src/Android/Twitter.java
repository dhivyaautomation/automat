package Appium_Emulator_programs.src.Android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Twitter {

		private static WebDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/amazon/");
			File app = new File(appDir, "com.twitter.android.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "emulator");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("autoGrantPermissions", true);
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.twitter.android");
		    capabilities.setCapability("appActivity", "com.twitter.android.LoginActivity");
		
		    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.findElement(By.id("com.twitter.android:id/login_identifier")).sendKeys("@yuva_msc");
			driver.findElement(By.id("com.twitter.android:id/login_password")).sendKeys("Loganayaki143.");
			driver.findElement(By.id("com.twitter.android:id/login_login")).click();
	}

}