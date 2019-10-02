package Amazon;

public class PickUpLocation {
   private String name;
   private String pickUpLocationId;
   private Address address;
public PickUpLocation(String name, String pickUpLocationId, Address address) {
	super();
	this.name = name;
	this.pickUpLocationId = pickUpLocationId;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPickUpLocationId() {
	return pickUpLocationId;
}
public void setPickUpLocationId(String pickUpLocationId) {
	this.pickUpLocationId = pickUpLocationId;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
   
}
