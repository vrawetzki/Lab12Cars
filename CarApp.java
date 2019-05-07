import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");
		int userInput = scan.nextInt();

//		ArrayList<String> make = listOfMakes();
//		ArrayList<String> model = listOfModels();
//		ArrayList<Double> year = listOfYears();
//		ArrayList<Double> price = listOfPrices();
//		
		ArrayList<Car> carList = new ArrayList<>();
		//Car car = null;
		for (int i = 0; i < userInput; i++) {
			System.out.println("Enter Car # " + (i+ 1) +  " Make: ");
			String make = scan.next();
			System.out.println("Enter Car #" + (i+ 1) +  " Model: ");
			String model = scan.next();
			System.out.println("Enter Car #" + (i+ 1)+  " year: ");
			int year = scan.nextInt();
			System.out.println("Enter Car #" + (i+ 1) +  " Price: ");
			double price = scan.nextInt();
			carList.add(new Car(make, model, year, price));
			
		}

//		Car car1 = new Car("Nikolai", "Model S", 2017, 54,999.90);
//		car.setMake("Nikolai");
//		car.setModel("Model S");
//		car.setYear(2017);
//		car.setPrice(54,999.90);
//		System.out.println(car1);
//		
//		Car car2 = new Car("Fourd", "Escapade", 2017, 31,999.90);
//		car.setMake("Fourd");
//		car.setModel("Escapade");
//		car.setYear(2017);
//		car.setPrice(31, 999.90);
//		System.out.println(car2);
//		
//		Car car3 = new Car("Chewie", "Vette", 2017, 44,989.95);
//		car.setMake("Chewie");
//		car.setModel("Vette");
//		car.setYear(2017);
//		car.setPrice(44,989.95);
//		System.out.println(car3);
//				
//		Car car4 = new UsedCar("Hyonda", "Prior", 2015, 14,795.50, 35,987.6);
//		car.setMake("Hyonda");
//		car.setModel("Prior");
//		car.setYear(2015);
//		car.setPrice(14,795.50);
//		car.setMileage(35,987.6);
//		System.out.println(car4);
//		
//		Car car5 = new UsedCar("GC", "Chirpus", 2013, 8,500.00, 12,345.0);
//		car.setMake("GC");
//		car.setModel("Chirpus");
//		car.setYear(2013);
//		car.setPrice(8,500.00);
//		car.setMileage(12,345.00);
//		System.out.println(car5);
//		
//		Car car6 = new UsedCar("GC", "Witherell", 2016, 14,450.00, 3,500.30);
//		car.setMake("GC");
//		car.setModel("WItherell");
//		car.setYear(2016);
//		car.setPrice(14,450.00);
//		car.setMileage(3,500.30);
//		System.out.println(car6);

		
		
		for (int i = 0; i < userInput; i++) {
			System.out.println(carList.get(i));
		}
		System.out.println("Current Inventory:");
		System.out.println("thankyou!");
		System.out.println(userInput);

		scan.close();

	}

}
