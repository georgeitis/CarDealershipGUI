// Name : George Saade
// Student ID : 500867644

public class Car extends Vehicle implements Comparable<Car> {
	
	
//Initiates variables.
	String  model ;
	int maxRange  ;
	double safetyRating ;
	boolean AWD ;
	double price ;

	public static final int SEDAN = 0 ;
	public static final int SUV = 1;
	public static final int SPORTS= 2 ; 
	public static final int MINIVAN= 3;
	
//Constructor for car
	public Car(String mfr, String color, String model, String power, double safetyRating, int maxRange, boolean aWD, double price) {
		super(mfr, color, power);
		this.model = model;
		this.maxRange = maxRange;
		this.safetyRating = safetyRating;
		AWD = aWD;
		this.price = price;
	}
	
	/**
	 * 
	 */
	public String display(){
		return super.display() + " " + model + " " + maxRange + " " + safetyRating + " " + price;
	}
	
//Compare two cars and see if they are identical
	public boolean equals(Object other) {
		Car other1 = (Car) other;
		if (Car.super.equals(other1)) {
			if (this.model == other1.model && this.AWD == other1.AWD) {
				return true;
			}
		}
		return false;
	}
	
	
//Compare two cars by price
	public int compareTo(Car o1) {
		if(price == o1.price)  return 0;
		else if (price < o1.price)  return -1;
		return +1;
		
	}
}



