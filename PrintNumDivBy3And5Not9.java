package payilagam_Assignment;

public class PrintNumDivBy3And5Not9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=1;
			
		while(number<=100) {
			if(number%3==0 && number%5==0 && number%9!=0) {
				System.out.print(number+" ");
						}
			number++;
		}
			
	}

}
