package edu.cgcc.cs161;

public class appointmnet {
	//fields
	private String Date;
	private String Time;
	//constructors
	void Appointment() {
		Date = "1/24/2021";
		Time = "18:00";
	}
	//operators
	public String getDate() {
		return Date;
	}
	public void setDate(String a) {
		Date = a;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String b) {
		Time = b;
	}
}
