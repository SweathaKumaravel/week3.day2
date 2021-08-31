package week3.day2assignment;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList =  new ArrayList<String>();
		arrList.add("Google");
		arrList.add("Microsoft");
		arrList.add("TestLeaf");
		arrList.add("Maverick");
		System.out.println(arrList);
		int arrayLength = arrList.size(); 
		System.out.println("The length of the array is: " + arrayLength);
		Collections.sort(arrList);
		System.out.println(arrList);
		System.out.println(arrList);
		System.out.print("[");
		for(int i=arrayLength-1;i>=0;i--)
		{
			System.out.print(arrList.get(i));
			if(i!=0)
				System.out.print(", ");
				
		}
		System.out.print("]");

	}

}
