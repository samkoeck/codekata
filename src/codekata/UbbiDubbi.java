package codekata;

public class UbbiDubbi {
	public String change(String input) {
		input = input.replaceAll("([aeiouAEIOU])", "ub$1");
		return input;
	}
}