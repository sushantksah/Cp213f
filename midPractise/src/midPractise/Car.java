package midPractise;

public class Car {
	private String model;
	private int year;
	private String color;
	
	public Car(String model, int year, String color) {
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	//Getters and Setters
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
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//display info
	public void displayInfo(String model, int year, String color) {
		System.out.println("Model: "+ model + ", Year: " + year + ", Color: " + color);
	}
	
	//Start/Stop
	public void Start() {
		System.out.println("Car is starting.");
	}
	
	public void Stop() {
		System.out.println("Car is stopping.");
	}
	
	
}

public class ElectricCar extends Car {
	private int batteryCapacity;
	
	public ElectricCar(String model, int year, String color, int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
		
	}
	
	
	
}
