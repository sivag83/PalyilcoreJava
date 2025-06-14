package payilagam_Assignment;

public class TaxCalculator {

	public static void main(String[] args) {

		double tax = calculateTax(100001);

		
	}

	// Tax calculation logic based on slabs
	public static double calculateTax(double salary) {
		double tax = 0;

		if (salary < 0) {
			System.out.println("Invalid Salary entered");
		} else if (salary > 0 && salary <= 100000) {
			System.out.println("Tax Slab is Nil");
			tax = 0;
		} else if (salary > 100000 && salary <= 500000) {
			System.out.println("Tax Slab is 3%");
			tax = (salary) * 0.03;
			System.out.printf("Tax to be paid: ₹%.2f" , tax);
		} else if (salary > 500000 && salary <= 700000) {
			System.out.println("Tax Slab is 5%");
			tax = (salary) * 0.05;
			System.out.printf("Tax to be paid: ₹%.2f" , tax);
		} else if (salary > 700000 && salary <= 1000000) {
			System.out.println("Tax Slab is 8%");
			tax = (salary) * 0.08;
			System.out.printf("Tax to be paid: ₹%.2f" , tax);
		} else if (salary > 1000000) {
			System.out.println("Tax Slab is 10%");
			tax = (salary) * 0.10;
			System.out.printf("Tax to be paid: ₹%.2f" , tax);
		}

		return tax;
	}
}
