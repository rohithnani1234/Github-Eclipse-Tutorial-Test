package com.manufacturer;

public class Manufacturer {
	private String manufacturerName;
	private String manufacturerAddress;
	private String registrationNumber;
	public Manufacturer(String manufacturerName,String manufacturerAddress,String registrationNumber) {
		this.manufacturerName=manufacturerName;
		this.manufacturerAddress=manufacturerAddress;
		this.registrationNumber=registrationNumber;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getManufacturerAddress() {
		return manufacturerAddress;
	}
	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String toString() {
		return "Manufacturer:"+manufacturerName+"\nRegistration Number:"+registrationNumber+"\nAddress:"+manufacturerAddress;
	}
	public static Manufacturer getManufacturerObject(String manufacturerName,String manufacturerAddress,String registrationNumber) {
		if (registrationNumber.length()!=10 || registrationNumber==null) {
			return null;
		}
		return new Manufacturer(manufacturerName, manufacturerAddress, registrationNumber);
	}
}
