

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?*/
public class Prime1001 {
	public static void main(String[] args) {
		int i, j, count = 1;

		for (i = 2; i < 100; i++) {
			for (j = i; j > 2; j--) {
				while (i % 2 != 0) {
					if (i % j == 0) {
						count = count + 1;
					}

				}
				if (count ==2) {

				}

			}

		}

	}

}
