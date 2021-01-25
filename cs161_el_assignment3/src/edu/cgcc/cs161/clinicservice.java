package edu.cgcc.cs161;

public class clinicservice {
	//fields
	private int serviceNumber;
	private String serviceName;
	private String serviceDescription;
	//constructor
	void clinicService() {
		serviceNumber = 256;
		serviceName = "regular check up";
		serviceDescription = "A regular check of pulse and vitals, alongside basic physical examination";
	}
	//operators
	public int getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(int a) {
		serviceNumber = a;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String b) {
		serviceName = b;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String c) {
		serviceDescription = c;
	}
}
