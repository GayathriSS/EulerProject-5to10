

import java.util.Scanner;

public class Primeornot {
	static int i;
	static int j;
	int k;

	public static void main(String[] args) {

		System.out.println("Enter the number which is to be verified");
		Scanner in = new Scanner(System.in);
		i = in.nextInt();

		boolean bol = value(i);
		if (bol == true) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

	public static boolean value(int k) {
		for (j = 2; j * 2 < k; j++) {
			if (k % j == 0) {
				return false;
			}
		}
		return true;

	}
}
