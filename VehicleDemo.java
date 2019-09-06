import java.util.*;
class Vehicle {
	String model;
	int year;
	String color;
	static int total_number_of_vehicles = 0;
	Vehicle(String model, String color, int year){
		Scanner sc = new Scanner(System.in);
		this.model = model;
		this.year = year;
		this.color = color;
		total_number_of_vehicles++;
	}
	void display(){
		System.out.println("Vehicle model:  "+model);
		System.out.println("Vehicle color:  "+color);
		System.out.println("Vehicle year:   "+year);
	}
	ststic void number(){
		System.out.println("Total number of vehicles = "+total_number_of_vehicles);
	}
}
class VehicleDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vehicles");
		int n = sc.nextInt();
		Vehicle v[] = new Vehicle[n];	
		System.out.println("\n\nEnter the details of "+n+" vehicles");
		for(int i=0;i<n;i++){
			System.out.print("\nVehicle"+(i+1)+":");
			System.out.print("\tModel:   ");
			String model = sc.next();
			System.out.print("\tColor:   ");
			String color = sc.next();
			System.out.print("\tYear:    ");
			int year = sc.nextInt();
			v[i] = new Vehicle(model, color, year);
		}
		Vehicle.number();
	}
}
