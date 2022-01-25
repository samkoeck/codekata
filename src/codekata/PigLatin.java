package codekata;

public class PigLatin {
	public String translate(String sentence) {
		String[] words = sentence.split(" ");
		String response = "";
		for (int i= 0 ; i < words.length ; i++) {
			if (isVowel(words[i].charAt(0))) {
				words[i] = words[i] + "way";
			} else {
				words[i] = words[i].substring(1) + words[i].substring(0, 1) + "ay";
			}
//			input = input.replaceAll("([aeiouyAEIOUY])", "ub$1");
			response += words[i] + " "  ;
		}
		return response;
	}
	
	public boolean isVowel(char ch) {
		if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
			return true;
		} else {
			return false;
		}
		
	}
}
