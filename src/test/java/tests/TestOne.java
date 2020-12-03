package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pages.CalculatorHomePage;

public class TestOne extends BaseClass {
	CalculatorHomePage home;
	@BeforeClass
	public void setupPageObjects() {
		home = new CalculatorHomePage(driver);
	}
	
	@Test
	public void addOneTwo() {
		home.digit1.click();
		home.addButton.click();
		home.digit2.click();
		home.equalToBtn.click();
		Assert.assertEquals(Integer.parseInt(home.result.getText()), 3);
		//PointOption point = new PointOption();
		Dimension windowSize = driver.manage().window().getSize();
		int height = windowSize.getHeight();
		int width = windowSize.getWidth();
		//VERTICAL SWIPE
		TouchAction action0 = new TouchAction(driver);
		action0.press(PointOption.point(width/2, height/2)).moveTo(PointOption.point(width/2, (int)(height*0.2))).perform();
		
		TouchAction action1 = new TouchAction(driver);
		TouchAction action2 = new TouchAction(driver);
		IOSTouchAction action3 = new IOSTouchAction(driver);
		//ACCESSIBILITY ID is the text of an element
		driver.findElementByAccessibilityId("Id");
		driver.hideKeyboard();
		
		Point dig1 = home.digit1.getLocation();
		Point dig2 = home.digit2.getLocation();
		action1.press(PointOption.point(dig1)).moveTo(PointOption.point(200,300)).perform();
		action2.press(PointOption.point(dig2)).moveTo(PointOption.point(300,200)).perform();
		
		MultiTouchAction zoom = new MultiTouchAction(driver);
		zoom.add(action1).add(action2).perform();
	}
}
