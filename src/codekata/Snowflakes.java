package codekata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Snowflakes {
	
	public void contains(String words) {	
		ArrayList<String> containWords = new ArrayList<>(Arrays.asList(words.split(" ")));
		ArrayList<String> used = new ArrayList<String>();
		for (int i = 0 ; i < containWords.size(); i++) {
			int y = 0;
			String pattern = "(?<!\\w)" + Pattern.quote(containWords.get(i)) + "(?!\\w)";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher( words );
			while (m.find()) {
			    y++;
			}
			if (y>0 && !used.contains(containWords.get(i))) {
				used.add(containWords.get(i));
			}
		}
		Collections.sort(used);
		for(String name:used) {
            System.out.print(name + " ");
        }
	}
	
}
