package init;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import books.oldTestament.protocanonical.wisdom.Proverbs;
import books.oldTestament.protocanonical.wisdom.Psaltery;
import calendar.Feasts;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	private static Calendar calendar() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

	private static void chooseOption() throws ParseException {
		
		Boolean validate1 = false;
		Boolean validate2 = false;
		
		do {
			System.out.println("What date do you wish to consult? (dd/MM/yyyy, must be after 1582)");
			String option = scanner.nextLine();
			validate1 = option.matches("[0-3]{1}[0-9]{1}/[0-1]{1}[0-9]{1}/[0-9]{4}");
			
			if (validate1) {
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(option);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date);
				
				validate2 = calendar.get(Calendar.YEAR) > 1582;
				
				if (validate2) {
					String period = new SimpleDateFormat("dd/MM/yyyy").format(date);
					reading(period, calendar);
				} else {
					System.out.println("Invalid date. Date must be after the year 1582.\n");
				}
			} else {
				System.out.println("Invalid date. Date must be on the dd/MM/yyyy format.\n");
			}
			
		} while (!validate1 || !validate2);
		
		
	}
	
	private static int corrector(int count) {
		if (count == 8 ) {
			count = 1;
		} else if (count == 9) {
			count = 2;
		} else if (count == 10) {
			count = 3;
		}
		
		return count;
	}

	private static void week(Calendar calendar) {
		String[] week = {"", "Sunday", "Monday", "Tuesday", "Wednesday", 
				"Thursday", "Friday", "Saturday"};
		
		
		int counter = weekday(calendar);
		
		for (int i = 1; i < week.length; i++) {
			counter = corrector(counter);
			reading(week[counter], calendar);
			calendar.add(Calendar.DAY_OF_YEAR, 1);
			counter++;
		}
		
	}

	private static void reading(String period, Calendar calendar) {
		
		Psaltery psaltery = new Psaltery();
		Proverbs proverbs = new Proverbs();
		Feasts feasts = new Feasts();
		
		System.out.printf("\nReadings for %s:\n", period);
		System.out.printf("\nFeast: %s\n", feasts.getFeast(calendar));
		System.out.println(psaltery.getPsalms(weekday(calendar)));
		System.out.println(proverbs.getProverbs(calendar));
	}

	private static int weekday(Calendar calendar) {
		
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		weekday = corrector(weekday);
		
		return weekday;
	}
	
	private static void controlPanel() throws ParseException {

		Boolean exit = false;

		do {
			System.out.println("\n\n========= BIBLE STUDY =========\n");
			System.out.println("1 - Today\n2 - Tomorrow\n3 - This week\n4 - Next week"
					+ "\n5 - Choose date\n0 - Exit\n\nChoose a study option: ");
			String option = scanner.nextLine();
			
			switch (option) {
			case "1": {
				reading("today", calendar());
				break;
			}
			case "2": {
				Calendar calendar = calendar();
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				reading("tomorrow", calendar);
				break;
			}
			case "3": {
				week(calendar());
				break;
			}
			case "4": {
				Calendar calendar = calendar();
				calendar.add(Calendar.DAY_OF_YEAR, 7);
				week(calendar);
				break;
			}
			case "5": {
				chooseOption();
				break;
			}
			case "0": {
				exit = true;
				System.out.println("\nExiting program...");
				break;
			}
			default:
				System.out.println("\nIncorrect input.");
				break;
			}

		} while (!exit);

	}

	public static void main(String[] args) {

		try {
			controlPanel();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
