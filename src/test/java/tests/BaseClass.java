package tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.ExtentReporter;
import utils.PropFileReader;

public class BaseClass extends ExtentReporter {
	//WebDriver driver;
	AppiumDriver<MobileElement> driver;
	String setupFilePath = System.getProperty("user.dir") + File.separator + "resources"+ File.separator + "setup.properties";
	String browserName = "";
	@BeforeTest
	public void setup() throws IOException {
		browserName = PropFileReader.readProperty(setupFilePath,"browser");
		if(browserName=="chrome") {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A20");
			cap.setCapability(MobileCapabilityType.UDID, "RZ8M54DR5EJ");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			cap.setCapability("appPackage", "com.google.android.calculator");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			String url = "http://127.0.0.1:4723/wd/hub";		
			driver = new AppiumDriver<MobileElement>(new URL(url),cap);			
			System.out.println("Application Started");
		}
	}
	@AfterTest
	public void tearDown() {		
		driver.close();
		driver.quit();
	}
}
