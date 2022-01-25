package codekata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Lastname {

	public void sortLast(ArrayList<String> al) {
		Collections.sort(al, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[] split1 = o1.split(" ");
				String[] split2 = o2.split(" ");
				String lastName1 = split1[1];
				String lastName2 = split2[1];
				if (lastName1.compareTo(lastName2) > 0) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		for (int i = 0 ; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	public void sortLastName(String lastnames) {
		ArrayList<String> myArray = new ArrayList<>(Arrays.asList(lastnames.split(", ")));

		sortLast(myArray);
		

	}
}
