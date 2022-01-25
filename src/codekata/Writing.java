package codekata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Writing {

	public String readFile(String filepath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
			// System.out.println(everything);
			return everything;
		}
	}

	public void contains(String text, String words) {	
		ArrayList<String> containWords = new ArrayList<>(Arrays.asList(words.split(" ")));
		ArrayList<String> notUsed = new ArrayList<String>();
		for (int i = 0 ; i < containWords.size(); i++) {
			int y = 0;
			String pattern = "(?<!\\w)" + Pattern.quote(containWords.get(i)) + "(?!\\w)";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher( text );
			while (m.find()) {
			    y++;
			}
			if (y==0) {
				notUsed.add(containWords.get(i));
			} else {
				System.out.println(containWords.get(i) + ": " + y);
			}
		}
		System.out.print("not used: ");
		for(String name:notUsed) {
            System.out.print(name + " ");
        }
	}

}
