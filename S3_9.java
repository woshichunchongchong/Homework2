package U3_two_stars;

import java.util.Scanner;

public class S3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = 0, num, tenth;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();
		for (int i = 1; i <= 9; ++i) {
			num = (int) (isbn / (Math.pow(10, i - 1)) % 10);
			total += num * (10 - i);
		}
		tenth = total % 11;
		if (tenth == 10)
			System.out.println("The ISBN-10 number is 0" + isbn + "X");
		else
			System.out.println("The ISBN-10 number is 0" + isbn + tenth);
		input.close();
	}

}
