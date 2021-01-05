package U3_two_stars;

import java.util.Scanner;

public class S3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 998 + 1);
		int buyerNum = input.nextInt();
		if (randomNum == buyerNum)
			System.out.println("$10000");
		else if ((randomNum % 10 == buyerNum % 10 && randomNum / 10 % 10 == buyerNum / 100 % 10
				&& randomNum / 100 % 10 == buyerNum / 10 % 10)
				|| (randomNum % 10 == buyerNum / 10 % 10 && randomNum / 10 % 10 == buyerNum % 10
						&& randomNum / 100 % 10 == buyerNum / 100 % 10)
				|| (randomNum % 10 == buyerNum / 100 % 10 && randomNum / 10 % 10 == buyerNum / 10 % 10
						&& randomNum / 100 % 10 == buyerNum % 10)
				|| (randomNum % 10 == buyerNum / 10 % 10 && randomNum / 10 % 10 == buyerNum / 100 % 10
						&& randomNum / 100 % 10 == buyerNum % 10)
				|| (randomNum % 10 == buyerNum / 100 % 10 && randomNum / 10 % 10 == buyerNum % 10
						&& randomNum / 100 % 10 == buyerNum / 10 % 10))
			System.out.println("$3000");
		else if (randomNum % 10 == buyerNum % 10 || randomNum % 10 == buyerNum / 10 % 10
				|| randomNum % 10 == buyerNum / 100 % 10 || randomNum / 10 % 10 == buyerNum % 10
				|| randomNum / 10 % 10 == buyerNum / 10 % 10 || randomNum / 10 % 10 == buyerNum / 100 % 10
				|| randomNum / 100 % 10 == buyerNum % 10 || randomNum / 100 % 10 == buyerNum / 10 % 10
				|| randomNum / 100 % 10 == buyerNum / 100 % 10)
			System.out.println("$1000");
		System.out.println(randomNum);
		input.close();
	}

}
