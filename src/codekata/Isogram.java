package codekata;

import java.util.Arrays;

public class Isogram {
	public boolean isIsogram(String word) {
		char letters[] = word.toCharArray();
		boolean notFound = true;
		Arrays.sort(letters);
		for(int i = 0 ; i < letters.length-1; i++) {
			if (letters[i] == letters[i + 1])
                notFound = false;
	    }
		return notFound;
	}
}
