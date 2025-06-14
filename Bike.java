package payilagam_Assignment;

public class Bike {
	
	public int getDistance(int distance){
		
		return distance;
	}
	
	public int getMileage(int distance, int fuelQuantity) {
		
		return distance/fuelQuantity;
	}

	public static void main(String[] args) {
		Bike myBike = new Bike();
		int distance = myBike.getDistance(300);
		int mileage = myBike.getMileage(distance, 5);
		System.out.println("Mileage of this bike:" +mileage);
		}
}
