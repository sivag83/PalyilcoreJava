package payilagam_Assignment;

public class DeepCopyMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		DeepCopySupport obj1= new DeepCopySupport(90);
		DeepCopySupport obj2= (DeepCopySupport) obj1.clone();
		System.out.println("Before Deep Copy");
		System.out.println("Object1 a value "+obj1.a);
		System.out.println("Object2 a value "+obj2.a);
		obj2.a=100;
		System.out.println("After Deep Copy");
		System.out.println("Object1 a value "+obj1.a);
		System.out.println("Object2 a value "+obj2.a);
	}
}
