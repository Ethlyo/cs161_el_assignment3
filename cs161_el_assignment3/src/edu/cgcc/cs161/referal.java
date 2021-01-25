package edu.cgcc.cs161;

public class referal {
	//fields
	private String providerName;
	private String Date;
	private String Time;
	
	//constructors
	void Referal() {
		providerName = "GA provider";
		Date = "1/24/2021";
		Time = "17:31";
	}
	//operations
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String a) {
		providerName = a;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String b) {
		Date = b;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String c) {
		Time = c;
	}
}
