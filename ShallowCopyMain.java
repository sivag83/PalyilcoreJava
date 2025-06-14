package payilagam_Assignment;

public class ShallowCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShallowEx obj1 = new ShallowEx();
		System.out.println("Before Copying");
		System.out.println("object1 a value "+obj1.a);
		System.out.println("object1 b value "+obj1.b);
		//Copying Objects
		ShallowEx obj2= obj1;
		System.out.println("object2 a value "+obj2.a);
		System.out.println("object2 b value "+obj2.b);
		
		obj2.a=1000;
		obj2.b=2000;
		
		System.out.println("After Copying");
		System.out.println("object1 a value "+obj1.a);
		System.out.println("object1 b value "+obj1.b);
		System.out.println("object2 a value "+obj2.a);
		System.out.println("object2 b value "+obj2.b);
		
	}

}
