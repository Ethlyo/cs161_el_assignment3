package edu.cgcc.cs161;

public class referallist {
	//fields
	private String providerName;
	private String Location;
	private String Phone;
	private String serviceProvided;
	//constructors
	void referalList() {
		providerName = "Ga Provider";
		Location = "456 St, blah blah city, Washington, US 87432";
		Phone = "1 (555) 555 1111";
		serviceProvided = "Regular Check";
	}
	//operators
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String a) {
		providerName = a;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String b) {
		Location = b;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String c) {
		Phone = c;
	}
	public String getServiceProvided() {
		return serviceProvided;
	}
	public void setServiceProvided(String d) {
		serviceProvided = d;
	}
	
	
	public void matchServiceNeeds() {
		
	}
	public void displayMatchedList() {
		
	}
}
