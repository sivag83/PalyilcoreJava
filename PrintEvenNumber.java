package payilagam_Assignment;

public class PrintEvenNumber {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		int count =1;
		int incre=0;
		while(count<=27){
		if(count%2==0){
		System.out.print(count+" ");
		incre++;
		}
		count++;
		}
			System.out.println();
			System.out.println("Even Number 1 to 27 Count: "+incre);
	}
}