package codekata;

public class Harmonica {
	public double calculate(double number) {
		double i = 1;
		double total = 0 ;
		while (i<number) {
			total += 1/i;
			i++;
		}
		double roundOff = Math.round(total*10000d)/10000d;
		return roundOff;
	}
}
