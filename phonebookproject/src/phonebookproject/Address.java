package phonebookproject;

public class Address {
public String Address;
public String city;
public String state;
public double zip;
public String phoneNumber;


public Address(String address, String city, String state, double zip, String phoneNumber) {
	Address = address;
	this.city = city;
	this.state = state;
	this.zip = zip;
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public double getZip() {
	return zip;
}
public void setZip(double zip) {
	this.zip = zip;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

	

}
