package codekata;

import java.util.ArrayList;

public class Hailstorm {
	public void hailstorm(int number) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while( number>1) {
			if (number % 2 == 0) {
				list.add(number);
				number = number/2;
			} else {
				list.add(number);
				number = number*3+1;
			}
		}
		list.add(1);
		for (int numbers : list) {
			System.out.print(numbers + " ");
			
		}
	}
}
