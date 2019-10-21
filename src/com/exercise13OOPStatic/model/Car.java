package com.exercise13OOPStatic.model;

public class Car {
	private String serialNumber;
	public static int numberDoors;
	private boolean isCoupe=false;
	private String brand;
	
	
	public Car() {}
	public Car(String serialNumber, int numberDoors) {
		this.serialNumber = serialNumber;
		this.numberDoors = numberDoors;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;	
	}
	public int getNumberDoors() {
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	public void CarIsCoupe(boolean isCoupe) {
		this.isCoupe = isCoupe;
		if(this.isCoupe)
			this.numberDoors=2;
	}
	public String ToString() {
		return "Serial number:"+this.serialNumber+", Door numbers:"+numberDoors;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}

}
