package codekata;

public class Prime {
	
	public int  countPrimes(String numbers) {
		String[] numberArray = numbers.split(" ");
		int total = 0;
		int number = 0;
		for (int i = 0 ; i < numberArray.length ; i++) {
			number = Integer.parseInt(numberArray[i]);
			if (isPrime(number)) {
				total += number;
			}
		}
		return total;
	}
	
	public boolean isPrime(int num) {
		boolean flag = true;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = false;
	        break;
	      }
	    }
		return flag;
	}
}
