package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoProgram {
	
	public boolean hasConsecutive(String input) {
		boolean flag = false;
		for(int i = 1; i < input.length();i++) {
			int index = input.indexOf(input.charAt(i));
			if(index == i - 1) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void findConsecutiveInSentence(ArrayList<String> input) {
//		boolean flag = false;
//		String[] words = input.split(",");
		for(String s:input) {
			System.out.println(s + ":" + this.hasConsecutive(s));
		}
	}
	
	
	public static void main(String[] args) {
		DemoProgram demo = new DemoProgram();
		
//		System.out.println(demo.hasConsecutive("hello"));
		//hello, saam, raman, sandee, elephant

		List<String> input = new ArrayList<String>();
//		input.add("hello");
//		input.add("saam");
		String[] names = {"hello", "saam", "raman", "sandee", "elephant"};
		input.addAll(Arrays.asList(names));
		for(String s:names) {
			System.out.println(s + ":" + demo.hasConsecutive(s));
		}
		
		
		
		
	}

}
