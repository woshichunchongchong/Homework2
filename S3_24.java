package U3_two_stars;

public class S3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 12), dec = (int) (Math.random() * 3);
		String number[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" },
				decor[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		System.out.println("The card you picked is " + number[num] + " of " + decor[dec]);
	}

}
