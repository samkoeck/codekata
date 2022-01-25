package codekata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingFruits {
	public void count(String text) {

		ArrayList<String> textSplitted = new ArrayList<>(Arrays.asList(text.split(" ")));
		ArrayList<String> wordsFound = new ArrayList<String>();
		for (int i = 0; i < textSplitted.size(); i++) {
			int y = 0;
			String pattern = "(?<!\\w)" + Pattern.quote(textSplitted.get(i)) + "(?!\\w)";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(text);
			while (m.find()) {
				y++;
			}
			String newFruit = textSplitted.get(i) + " : " + y;
			if (y>0 && !wordsFound.contains(newFruit)) {
				wordsFound.add(newFruit);
			}
		}
		Collections.sort(wordsFound);
		for(String sorted : wordsFound) {
			System.out.println(sorted);
		}
	}
}
