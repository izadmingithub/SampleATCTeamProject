package LearningTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-yyyy");
		LocalDate localDate = LocalDate.now().plusMonths(5);
		System.out.println(dtf.format(localDate));			
	}
}