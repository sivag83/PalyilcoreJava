package payilagam_Assignment;

public class PrintNumDIvBy5And2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1;
		int count=0;
		
		while(number<=100) {
			if(number%2==0 && number%5==0) {
				System.out.print(" "+number);
				count++;
				
			}
			number++;
		}
			
	}

}
