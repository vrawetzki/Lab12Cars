

public class UsedCar extends Car {
	
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, (int) price, mileage);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: %-10s Mileage: %-10s", this.getMake(), this.getModel(), this.getYear(), this.getPrice(), mileage);
	}
}
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Welcome to Grand Circus Motors Admin console!");
//		System.out.println("Car" + "          " + "Price");
//		
//		ArrayList<> 
//
//		do {
//			System.out.println("Please Select a car");
//		
//	}
//
//	public static ArrayList<String>listOfMake(){
//		ArrayList<String> newMake = new ArrayList<String>();
//		newMake.add("Hyonda");
//		newMake.add("GC");
//		newMake.add("GC");
//		newMake.add("Nikolai");
//		newMake.add("Fourd");
//		newMake.add("Chewie");
//		
//		return newMake;
//	}
//	public static ArrayList<String>listOfModels(){
//		ArrayList<String> newCar = new ArrayList<String>();
//		newCar.add("Prior");
//		newCar.add("Chirpus");
//		newCar.add("Witherell");
//		newCar.add("Model S");
//		newCar.add("Escapade");
//		newCar.add("Vette");
//		
//		return newCar;
//	}
//	public static ArrayList<Double>listOfYears(){
//		ArrayList<Double> carYear = new ArrayList<Double>();
//		carYear.add(2015);
//		carYear.add(2013);
//		carYear.add(2016);
//		carYear.add(2017);
//		carYear.add(2017);
//		carYear.add(2017);
//	}
//	
//	public static ArrayList<Double>listOfCarPrice(){
//		ArrayList<Double> carPrice = new ArrayList<Double>();
//		carPrice.add(14,795.50);
//		carPrice.add(8,500.00);
//		carPrice.add(14,450.00);
//		carPrice.add(54,999.09);
//		carPrice.add(31,999.90);
//		carPrice.add(44,989.95);
//	
//		return carPrice;
//	}
}
