package edu.cgcc.cs161;

public class client {
	//fields
	private String firstName;
	private String lastName;
	private String Street;
	private String City;
	private String State;
	private String Country;
	private int zipCode;
	private String phoneNumber;
	private String Email;
	private String insuranceCarrier;
	
	//constructors
	void Client() {
		firstName = "Ethan";
		lastName = "Lyons";
		Street = "XYZ St.";
		City = "White Salmon";
		State = "Washington";
		Country = "United States";
		zipCode = 98672;
		phoneNumber = "1 (555) 555 5555";
		Email = "ethanlyons@xyzmail.com";
		insuranceCarrier = "Insurance ABC";
	}	
	
	//operations
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String a) {
		firstName = a;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String b) {
		lastName = b;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String c) {
		Street = c;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String d) {
		City = d;
	}
	public String getState() {
		return State;
	}
	public void setState(String e) {
		State = e;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry (String f) {
		Country = f;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int g) {
		zipCode = g;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String h) {
		phoneNumber = h;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String i) {
		Email = i;
	}
	public String getInsuranceCarrier() {
		return insuranceCarrier;
	}
	public void setInsuranceCarrier(String j) {
		insuranceCarrier = j;
	}
}
