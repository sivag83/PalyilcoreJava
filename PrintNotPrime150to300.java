package payilagam_Assignment;

public class PrintNotPrime150to300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 150;

		while (number <= 300) {
			int i = 1;
			int count = 0;
			while (i <= number) {
				if (number % i == 0) {
					count++;
				}
				i++;
			}

			if (count != 2) {
				System.out.print(number + " ");
			}

			number++;
		}
	}
}
