import java.util.Scanner;

public class Currency_Exchange {

	public static void main(String[] args) {

		// Currency exchange menu with 3 currency conversion options

		// Create Scanner for user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose one of the folowing options: ");
		System.out.println("1) $ to €");
		System.out.println("2) € to $");
		System.out.println("3) £ to $");
		System.out.println("4) Exit Interface");

		// User's input via Scanner
		int exchange = sc.nextInt();

		// Navigate exchange menu, according to user's choice

		switch (exchange) {

		case 1: {
			System.out.println("Enter the amount of $");

			double usd = sc.nextDouble();

			if (usd >= 0) {

				System.out.println(usd + " $ is " + usd * 0.908 + " €");
			} else {
				System.out.println("Please enter positive amount of $.");

			}
		}
			break;

		case 2: {
			System.out.println("Enter the amount of €");

			double euro = sc.nextDouble();

			if (euro >= 0) {

				System.out.println(euro + " € is " + euro * 1.101 + " $.");
			} else {
				System.out.println("Please enter positive amount of €.");

			}
		}
			break;

		case 3: {
			System.out.println("Enter the amount of £");

			double pounds = sc.nextDouble();

			if (pounds >= 0) {

				System.out.println(pounds + " $ is " + pounds * 1.28 + " £");
			} else {
				System.out.println("Please enter positive amount of £.");

			}
		}
			break;

		case 4: {
			System.out.println("Thank you for using Currency Exchange App.");
			break;
		}

		}
		sc.close();
	}
}
