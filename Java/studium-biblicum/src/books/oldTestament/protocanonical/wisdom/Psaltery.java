package books.oldTestament.protocanonical.wisdom;

public class Psaltery {

	// Sunday Psalms
	final private String sundayPsalms = "1, 2, 3, 4, 8, 9, 10, 53, 62, 90, 92, 94, 99, 109, 110, 111, 112, 113, 116, "
			+ "117, 118, 133, 143, 144, 148";

	// Monday Psalms
	final private String mondayPsalms = "5, 6, 7, 13, 14, 16, 17, 18, 19, 20, 23, 26, 27, 28, 29, 30, 31, 32, 46, "
			+ "114, 115, 119, 120, 121";

	// Tuesday Psalms
	final private String tuesdayPsalms = "11, 12, 15, 24, 34, 36, 37, 38, 39, 40, 41 42, 43, 66, 95, 122, 123, 124, "
			+ "125, 126, 134";

	// Wednesday Psalms
	final private String wednesdayPsalms = "25, 33, 44, 45, 47, 48, 49, 50, 51, 52, 54, 55, 56, 57, 58, 59, 60, 64, 96, "
			+ "100, 127, 128, 129, 130, 131, 145";

	// Thursday Psalms
	final private String thursdayPsalms = "22, 35, 61, 65, 67, 68, 69, 70, 71, 72, 73, 74, 75, 89, 97, 132, 135, 136, "
			+ "137, 146";

	// Friday Psalms
	final private String fridayPsalms = "21, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 88, 98, 138, 139, 140, 141, "
			+ "142, 147";

	// Saturday Psalms
	final private String saturdayPsalms = "63, 87, 91, 93, 101, 102, 103, 104, 105, 106, 107, 108, 149, 150";

	public String getPsalms(int weekday) {

		String psalms = "Psalms ";
		switch (weekday) {
		case 1:
			psalms += sundayPsalms;
			break;
		case 2:
			psalms += mondayPsalms;
			break;
		case 3:
			psalms += tuesdayPsalms;
			break;
		case 4:
			psalms += wednesdayPsalms;
			break;
		case 5:
			psalms += thursdayPsalms;
			break;
		case 6:
			psalms += fridayPsalms;
			break;
		case 7:
			psalms += saturdayPsalms;
			break;
		default:
			break;
		}

		return psalms;
	}

}
