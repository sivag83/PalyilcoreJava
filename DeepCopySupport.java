package payilagam_Assignment;

public class DeepCopySupport implements Cloneable {
	
	int a;
	DeepCopySupport(int a){
		this.a=a;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
