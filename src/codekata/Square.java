package codekata;

public class Square {
	public String squareSequence(int num) {
		int found = 0;
		int base = 1;
		int total = 0;
		String answer = "";
		while (found < num) {
			if (checkPerfectSquare(base)) {
				found++;
				total += base;
				answer += base + " ";
			}
			base++;
		}
		answer += "sum = " + total;
		return answer;
	}
	
	static boolean checkPerfectSquare(double x)  
    { 

	double sq = Math.sqrt(x); 
	return ((sq - Math.floor(sq)) == 0); 
    } 
}
