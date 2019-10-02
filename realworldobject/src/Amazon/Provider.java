package Amazon;
import java.util.Date;
import java.util.HashMap;
public class Provider {
  private String providerName;
  private String providerId;
  private Address ProviderAddress;
  private HashMap<Integer,Date> DateOfDelivery;
public Provider(String providerName, String providerId, Address providerAddress,
		HashMap<Integer, Date> dateOfDelivery) {
	super();
	this.providerName = providerName;
	this.providerId = providerId;
	ProviderAddress = providerAddress;
	DateOfDelivery = dateOfDelivery;
}
public String getProviderName() {
	return providerName;
}
public void setProviderName(String providerName) {
	this.providerName = providerName;
}
public String getProviderId() {
	return providerId;
}
public void setProviderId(String providerId) {
	this.providerId = providerId;
}
public Address getProviderAddress() {
	return ProviderAddress;
}
public void setProviderAddress(Address providerAddress) {
	ProviderAddress = providerAddress;
}
public HashMap<Integer, Date> getDateOfDelivery() {
	return DateOfDelivery;
}
public void setDateOfDelivery(HashMap<Integer, Date> dateOfDelivery) {
	DateOfDelivery = dateOfDelivery;
}
}
