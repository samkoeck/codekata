package codekata;

import java.util.ArrayList;

public class Filter {
	public String filterOut(String input) {
		
		String[] splitInput = input.split(",");
		ArrayList<String> number = new ArrayList<String>();
		for (int i = 0 ; i < splitInput.length; i++) {
			try {
				Float.parseFloat(splitInput[i]);
				number.add(splitInput[i]);
				}
				catch(Exception e) {
				  //  Block of code to handle errors
				}
		}
		
		String output = "";
		for (String numbers : number) {
			output += numbers + " ";
		}
		
		return output;
		
	}
}
