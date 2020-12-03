package misc;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public void printSet(Map<String,String> headers) {
		for(Map.Entry<String, String> entry : headers.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("hearderOne","headerValue1");
		map.put("hearderTwo","headerValue2");
		map.put("hearderThree","headerValue3");
		
//		MapDemo demo = new MapDemo();
//		demo.printSet(map);
		HashMap<String,HashMap<String,String>> m = new HashMap<String,HashMap<String,String>>();
		m.put("one",map);
		m.put("two",map);
		for(Map.Entry<String,HashMap<String,String>> a: m.entrySet()) {
			HashMap<String,String> value = a.getValue();
			for(Map.Entry<String, String> b:value.entrySet()) {
				System.out.println(b.getValue());
			}
		}
		

	}

}
