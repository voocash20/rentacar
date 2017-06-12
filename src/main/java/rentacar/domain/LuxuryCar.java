package rentacar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LuxuryCar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String brand;
	private String model;
	private String type;
	private int mileage;
	private int numberOfSeats;
	private int numberOfDoors;
	private boolean hasAC;
	private int enginePower;
	private boolean hasAutomaticTransmission;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public boolean isHasAC() {
		return hasAC;
	}
	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public boolean isHasAutomaticTransmission() {
		return hasAutomaticTransmission;
	}
	public void setHasAutomaticTransmission(boolean hasAutomaticTransmission) {
		this.hasAutomaticTransmission = hasAutomaticTransmission;
	}
	
	
	
}
