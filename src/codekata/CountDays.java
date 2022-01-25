package codekata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountDays {
	public String calculateDifference(String startDate, String endDate) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String[] dateParts = startDate.split("/");
		
		String month = "";
		if (dateParts.length == 3) {
			month = dateParts[1];
		}
        
		long difference_In_Days = 0;
		startDate = startDate.replaceAll(" ", "/");
		startDate = startDate.replaceAll("januari", "01");
		startDate = startDate.replaceAll("februari", "02");
		startDate = startDate.replaceAll("maart", "03");
		startDate = startDate.replaceAll("april", "04");
		startDate = startDate.replaceAll("mei", "05");
		startDate = startDate.replaceAll("juni", "06");
		startDate = startDate.replaceAll("juli", "07");
		startDate = startDate.replaceAll("augustus", "08");
		startDate = startDate.replaceAll("september", "09");
		startDate = startDate.replaceAll("oktober", "10");
		startDate = startDate.replaceAll("november", "11");
		startDate = startDate.replaceAll("december", "");
		
		endDate = endDate.replaceAll(" ", "/");
		endDate = endDate.replaceAll("januari", "01");
		endDate = endDate.replaceAll("februari", "02");
		endDate = endDate.replaceAll("maart", "03");
		endDate = endDate.replaceAll("april", "04");
		endDate = endDate.replaceAll("mei", "05");
		endDate = endDate.replaceAll("juni", "06");
		endDate = endDate.replaceAll("juli", "07");
		endDate = endDate.replaceAll("augustus", "08");
		endDate = endDate.replaceAll("september", "09");
		endDate = endDate.replaceAll("oktober", "10");
		endDate = endDate.replaceAll("november", "11");
		endDate = endDate.replaceAll("december", "12");
		if (dateParts.length == 3 && Integer.parseInt(month) > 12) {
			return "There is no " + month + "th month";
		} else {
			try {
				Date d1 = sdf.parse(startDate);
				Date d2 = sdf.parse(endDate);
				
				long difference_In_Time = d2.getTime() - d1.getTime();
				difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
				long difference_In_Years = (difference_In_Time / (1000l * 60 * 60 * 24 * 365));
				if (difference_In_Years > 0) {
					difference_In_Days += difference_In_Years * 365;
				}
			} catch (ParseException e) {
				return "The date is wrong";
			}
			return difference_In_Days + " days";
		}
	}
}
