
public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	//private double mileage;

	public Car() {

	}

	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		//this.mileage = mileage;
	}

	public Car(String string, String string2, int i, int j, double d) {
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price, double d) {
		this.price = price;
	}
//	public double getMileage() {
//		return mileage;
//	}
//	public void setMileage(double mileage, double d) {
//		this.mileage = mileage;
//	}
		
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: %-10s", make, model, year, price);
	}
	}
	
