package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer("Tom", "5th floor, No.9, Central Road, Taoyuan City, Taiwan", 1500);
		
		Vehicle vehicle = new Vehicle(8000,"Honda","Accord");
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle Car = new Vehicle(8000,"Honda","Accord");
		
		boolean value = Car.equals(vehicle); 
		System.out.println(value);
	}

}
