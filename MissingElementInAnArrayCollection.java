package week3.day2assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayCollection {

	public static void main(String[] args) {
		Integer[] arr = { 0,1,2,3,4,7,6,8};
		int length = arr.length;
		List<Integer> arrList = Arrays.asList(arr);
		Collections.sort(arrList);
		for(int i = 0 ; i<length;i++) {
			if(arr[i] != i) {
				System.out.println("Missing Element in an array using collection : "+i);
				break;
				
			}
		}
		

	}

}

