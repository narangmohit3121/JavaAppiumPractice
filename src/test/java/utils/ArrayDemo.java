package utils;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ArrayDemo {
	
	public Integer findThirdLargest(Integer[] array) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for(Integer i : array) {
			numbers.add(i);
		}
		Integer max = 0;
		for(Integer i = 0;i <numbers.size(); i++) {
			if(numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		numbers.remove(max);
		System.out.println(numbers);
		max = 0;
		for(Integer i = 0;i <numbers.size(); i++) {
			if(numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}
		return max;
			
		}
	//[100,99,23,24,6,25,7]
	public static void main(String[] args) {
		ArrayDemo demo = new ArrayDemo();
		Integer[] arr = new Integer[] {100,24}; 
		System.out.println(demo.findThirdLargest(arr));

	}

}
