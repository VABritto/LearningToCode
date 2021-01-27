package books.oldTestament.protocanonical.wisdom;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Proverbs {

	final private String[] proverbs = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

	private String getFrom31Month(int monthDay) {
		String proverbs = this.proverbs[monthDay - 1];
		return proverbs;
	}

	private String getFrom30Month(int monthDay) {

		String proverbs = this.proverbs[monthDay - 1];

		if (monthDay == 30) {
			proverbs += ", " + this.proverbs[monthDay];
		}
		return proverbs;
	}

	private String getFromFebruary(int monthDay, Calendar calendar) {

		GregorianCalendar gc = new GregorianCalendar();

		String proverbs = this.proverbs[monthDay - 1];

		if (gc.isLeapYear(calendar.get(Calendar.YEAR))) {
			if (monthDay == 29) {
				proverbs += ", " + this.proverbs[monthDay] + ", " 
						+ this.proverbs[monthDay + 1];
			}
		} else {
			if (monthDay == 28) {
				proverbs += ", " + this.proverbs[monthDay] + ", " 
						+ this.proverbs[monthDay + 1] + ", "
						+ this.proverbs[monthDay + 2];
			}
		}
		return proverbs;
	}

	public String getProverbs(Calendar calendar) {
		String proverbs = "Proverbs ";

		int month = calendar.get(Calendar.MONTH) + 1;
		int monthDay = calendar.get(Calendar.DAY_OF_MONTH);

		switch (month) {
		case 1: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		case 2: {
			proverbs += getFromFebruary(monthDay, calendar);
			break;
		}
		case 3: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		case 4: {
			proverbs += getFrom30Month(monthDay);
			break;

		}
		case 5: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		case 6: {
			proverbs += getFrom30Month(monthDay);
			break;
		}
		case 7: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		case 8: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		case 9: {
			proverbs += getFrom30Month(monthDay);
			break;
		}
		case 10: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		case 11: {
			proverbs += getFrom30Month(monthDay);
			break;
		}
		case 12: {
			proverbs += getFrom31Month(monthDay);
			break;
		}
		default:
			break;
		}

		return proverbs;
	}
}
