package car_dealership;

import java.util.Objects;

public class Vehicle {
	private double price;
	private String maker;
	private String model;

	
	
	public Vehicle(double price, String maker, String model) {
		super();
		this.price = price;
		this.maker = maker;
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", maker=" + maker + ", model=" + model + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maker, model, price);
	}


	
	

	
	
}
