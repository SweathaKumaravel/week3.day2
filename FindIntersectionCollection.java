package week3.day2assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ListA = new ArrayList<Integer>();
		ListA.add(3);
		ListA.add(2);
		ListA.add(11);
		ListA.add(4);
		ListA.add(6);
		ListA.add(7);
		System.out.println("ListA = " + ListA);
		
		List<Integer> ListB = new ArrayList<Integer>();
		ListB.add(1);
		ListB.add(2);
		ListB.add(8);
		ListB.add(4);
		ListB.add(9);
		ListB.add(7);
		System.out.println("ListB = " + ListB);
		List<Integer> listIntersection =new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < ListA.size() && j < ListB.size()){
			listIntersection.add(ListA.get(i));
			listIntersection.add(ListB.get(j));
			i++;
			j++;
		}
		System.out.println("List of Intersection of Two List:");
		System.out.println(listIntersection);

	}

}
