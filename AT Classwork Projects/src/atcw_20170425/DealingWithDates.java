package atcw_20170425;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DealingWithDates {

	public static void main(String[] args) {
		Date now = new Date(1493145969721l);
		System.out.println(now);

		Calendar today = new GregorianCalendar();
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		
		Calendar nextWeek = new GregorianCalendar(2017, 5, 30);
		Color n = new Color(5, 10, 15);

		System.out.println(nextWeek.get(Calendar.DATE));
		System.out.println(nextWeek.get(Calendar.YEAR));
		System.out.println(nextWeek.get(Calendar.WEEK_OF_YEAR));
		System.out.println(nextWeek.get(Calendar.DAY_OF_WEEK));
	}

}
