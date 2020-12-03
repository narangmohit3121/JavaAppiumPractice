package misc;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadDemo {
	public static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return new Integer(10);
		}
		public Integer get() {
			return super.get();
		}
	};
	public Operate add = (int x,int y)->{
		return x + y;
	};
//	Operate subtract = (int x, int y)-> {
//		return x - y;
//	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new ChromeDriver();
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(new ThreadDemo().add.operate(10, 20));
		
//		for(int i=1; i<=20;i++) {
//			System.out.println(ThreadDemo.local.hashCode() + "," +  ThreadDemo.local.get());
//		}
	}

}
