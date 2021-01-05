package U3_two_stars;

import java.util.Scanner;

public class S3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble(), y1 = input.nextDouble(), w1 = input.nextDouble(), h1 = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble(), y2 = input.nextDouble(), w2 = input.nextDouble(), h2 = input.nextDouble();
		if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= Math
				.sqrt(((w1 - w2) / 2) * ((w1 - w2) / 2) + ((h1 - h2) / 2) * ((h1 - h2) / 2)))
			System.out.println("r2 is inside r1");
		else if (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) <= Math
				.sqrt(((w1 + w2) / 2) * ((w1 + w2) / 2) + ((h1 + h2) / 2) * ((h1 + h2) / 2)))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlaps r1");
		input.close();
	}

}
