package U3_two_stars;

import java.util.Scanner;

public class S3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = input.nextInt();
		System.out.print("Enter day of the month: 1-31: ");
		int day = input.nextInt();
		if (month < 3) {
			month += 12;
			year--;
		}
		int q = day, m = month, j = year / 100, k = year % 100;
		int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String week[] = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		System.out.println("Day of the week is " + week[h]);
		input.close();
	}

}
