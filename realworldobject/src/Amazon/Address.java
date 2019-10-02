package Amazon;

public class Address {
  private String HouseNo;
  private String ApartmentName;
  private String locality;
  private String landMark;
  private String district;
  private String state;
  private String country;
  private long pinCode;
public Address(String houseNo, String apartmentName, String locality, String landMark, String district, String state,
		String country, long pinCode) {
	HouseNo = houseNo;
	ApartmentName = apartmentName;
	this.locality = locality;
	this.landMark = landMark;
	this.district = district;
	this.state = state;
	this.country = country;
	this.pinCode = pinCode;
}
public String getHouseNo() {
	return HouseNo;
}
public void setHouseNo(String houseNo) {
	HouseNo = houseNo;
}
public String getApartmentName() {
	return ApartmentName;
}
public void setApartmentName(String apartmentName) {
	ApartmentName = apartmentName;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getLandMark() {
	return landMark;
}
public void setLandMark(String landMark) {
	this.landMark = landMark;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public long getPinCode() {
	return pinCode;
}
public void setPinCode(long pinCode) {
	this.pinCode = pinCode;
}
  
}
