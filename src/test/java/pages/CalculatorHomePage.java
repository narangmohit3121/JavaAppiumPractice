package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorHomePage {
	//public AppiumDriver<MobileElement> driver;
	public MobileElement digit1;
	public MobileElement digit2;
	public MobileElement addButton;
	public MobileElement equalToBtn;
	public MobileElement result;
	
	public CalculatorHomePage(AppiumDriver<MobileElement> driver) {
		//this.driver = driver;
		digit1 = driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_1')]"));
		digit2 = driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_2')]"));
		addButton = driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'op_add')]"));
		equalToBtn = driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'eq')]"));
		result = driver.findElement(By.xpath("//*[contains(@resource-id,'result_final')]"));		
	}
	
//	public MobileElement digit1() {
//		return driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_1')]"));
//	}
	
	
	
}
