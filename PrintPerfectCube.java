package payilagam_Assignment;

public class PrintPerfectCube {

	public static void main(String[] args) {
		int number = 1;
		int result = 0;
		while (number <= 150) {
			result = number * number * number;
			if (result <= 150) {
				System.out.print(result + " ");
			}
			number++;
		}

	}

}
