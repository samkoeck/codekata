package codekata;

public class Caeser {
	public String shiftInAlphabet(int number, String line) {
		char[] toShift = line.toCharArray();
		for (int i = 0; i < toShift.length; i++) {
			if (number < 0) {
				number = number + 26;
			}
			if (Character.isLetter(toShift[i])) {
				toShift[i] = (char) ((toShift[i] + number - (int) 'a') % 26 + (int) 'a');
			}

		}
		line = String.valueOf(toShift);
		return line;
	}
}
