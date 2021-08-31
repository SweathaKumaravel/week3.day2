package week3.day2assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> uniqueWords = new LinkedHashSet<String>();
		Set<String> duplicateWords = new LinkedHashSet<String>();
for (String eachWord : words) {
	if(!uniqueWords.add(eachWord)) {
		duplicateWords.add(eachWord);
	}
}
for (String wd : uniqueWords) {
	System.out.print(wd + " ");
}
	}



	}


