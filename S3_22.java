package U3_two_stars;

import java.util.Scanner;

public class S3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble(), y = input.nextDouble();
		if (Math.sqrt((x * x) + (y * y)) <= 10.0)
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
		input.close();
	}

}
