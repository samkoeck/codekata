package codekata;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
	//	Lastname lastname = new Lastname();
	//	lastname.sortLastName("Tristan Vandevelde, Elke Boonen, Collin Van der vorst, Charlie Beirnaert");
		
//		Writing writing = new Writing();
//		String file = writing.readFile("C:\\Users\\koecksa\\Downloads\\files\\maan.txt");
//		writing.contains(file, "mannetje maan zon boswachter kluizenaar toverkracht zondag");
		
	//	Isogram isogram = new Isogram();
	//	System.out.println(isogram.isIsogram("dermatoglyphics"));
	//	System.out.println(isogram.isIsogram("patterns"));
		
	//	Snowflakes snowflakes = new Snowflakes();
	//	snowflakes.contains("pineapple pear citron banana pineapple peach peach kiwi mandarin pineapple cherry pear pear citron");
	//	snowflakes.contains("banana peach kiwi cherry cherry apricot");
		
//		int[][] a = {
//	            {2,7,0}, 
//	            {8,4,1}, 
//	            {1,0,10}, 
//	        };
//		int[][] b = {
//	            {11,11,18,15,2}, 
//	            {13,13,1,4,6}, 
//	        };
//		MagicTable magicTable = new MagicTable();
//		System.out.println(magicTable.print2D(3, a));
//		System.out.println(magicTable.print2D(2, b));
		
//		Hailstorm hailstorm = new Hailstorm();
//		hailstorm.hailstorm(12);
//		System.out.println();
//		hailstorm.hailstorm(1000);
		
//		Caeser caeser = new Caeser();
//		System.out.println(caeser.shiftInAlphabet(-3, "abcdefghijklmnopqrstuvwxyz"));
//		System.out.println(caeser.shiftInAlphabet(23, "abcdefghijklmnopqrstuvwxyz"));
		
//		Filter filter= new Filter();
//		System.out.println(filter.filterOut("1,2,apple,1,12.3,this is true,true,8"));
		
//		UbbiDubbi ubbidubbi = new UbbiDubbi();
//		System.out.println(ubbidubbi.change("hello"));
//		System.out.println(ubbidubbi.change("apple"));
		
//		CountDays countDays = new CountDays();
//		System.out.println(countDays.calculateDifference("13/11/2020", "24 december 2020"));
//		System.out.println(countDays.calculateDifference("23 november 2020", "23/11/2021"));
//		System.out.println(countDays.calculateDifference("11/13/2020", "24 december 2020"));
		
//		Harmonica harmonica = new Harmonica();
//		System.out.println(harmonica.calculate(5));
//		System.out.println(harmonica.calculate(23));
		
//		PigLatin piglatin = new PigLatin();
//		System.out.println(piglatin.translate("eat this"));
//		System.out.println(piglatin.translate("happy day"));
		
//		CountingFruits countingFruit = new CountingFruits();
//		countingFruit.count("cherry peach lime apricot peach citron lime citron orange apple kiwi kiwi lime pineapple peach");
		
//		Prime prime = new Prime();
//		System.out.println(prime.countPrimes("2 3 4 5 7 8 9 10"));
		
//		Square square = new Square();
//		System.out.println(square.squareSequence(5));
//		System.out.println(square.squareSequence(15));
		
		Vowel vowel = new Vowel();
		String file = vowel.readFile("C:\\Users\\koecksa\\Downloads\\files\\maan.txt");
		vowel.count(file);
		
	}
}
