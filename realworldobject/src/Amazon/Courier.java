package Amazon;

public class Courier {
  private String courierServiceName;
  private String ownerName;
  private Address address;
public Courier(String courierServiceName, String ownerName, Address address) {
	super();
	this.courierServiceName = courierServiceName;
	this.ownerName = ownerName;
	this.address = address;
}
public String getCourierServiceName() {
	return courierServiceName;
}
public void setCourierServiceName(String courierServiceName) {
	this.courierServiceName = courierServiceName;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
