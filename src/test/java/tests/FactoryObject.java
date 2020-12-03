package tests;

import org.testng.annotations.Test;

public class FactoryObject {
	Integer param;
	public FactoryObject(Integer param) {
		this.param = param;
	}
	public FactoryObject(Integer param1,Integer param2,Integer param3) {
		this.param = param1 + param2 + param3;
	}
	@Test
	public void testOne() throws InterruptedException {
		System.out.println("TestOne:" + param);
		Thread.sleep(1000);
	}
	//@Test(dependsOnMethods = {"testOne"})
	@Test
	public void testTwo() throws InterruptedException {
		System.out.println("TestTwo:" + (param + 1));
		Thread.sleep(1000);
	}
}
