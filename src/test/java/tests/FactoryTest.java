package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryTest {
	
//	@Factory(dataProvider = "provider")
//	public Object[] factoryTest(int x, int y, int z) { 
//		return new Object[] {new FactoryObject(x),new FactoryObject(x,y,z)};
//	}
	@Factory//(dataProvider = "provider")
	public Object[] factoryTest() { 
		return new Object[] {new FactoryObject(1),new FactoryObject(4)};
	}
	
	@DataProvider(name="provider")
	public Object[][] parameters(){
		return new Object[][] {{1,2,3},{4,5,6}};
	}
}
