package week3.day2assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicateWeek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PayPal India";
		System.out.println("The original string : " + str);
		char charArray[] = str.toCharArray();
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			charSet.add(str.charAt(i));
		}
		System.out.println("The removed duplicate string is: ");
		for (Character ch : charSet)
			System.out.print(ch);
	}



	}


