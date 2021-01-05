package U3_two_stars;

import java.util.Scanner;

public class S3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		if (a + b > c & a + c > b & b + c > a)
			System.out.println(a + b + c);
		else
			System.out.println("Illegal!");
		input.close();
	}

}
