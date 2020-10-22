package Appium_Emulator_programs.src.Android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Redbus {

		@SuppressWarnings("unused")
		private static RemoteWebDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/amazon/");
			File app = new File(appDir,"in.redbus.android-42006.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "emulator");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			//System.out.println(app.getAbsolutePath());
			capabilities.setCapability("appPackage", "in.redbus.android");
		    capabilities.setCapability("appActivity", "in.redbus.android.root.SettingsActivity");
		    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		    Thread.sleep(10000);
		/*	driver.findElement(By.id("com.twitter.android:id/login_identifier")).sendKeys("@yuva_msc");
			driver.findElement(By.id("com.twitter.android:id/login_password")).sendKeys("Loganayaki143.");
			driver.findElement(By.id("com.twitter.android:id/login_login")).click();*/
	}

}