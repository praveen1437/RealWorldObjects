package Amazon;

public class Item {
  private String name;
  private double price;
  private Provider[] providers;
  private boolean isEligibleForPrime;
public Item(String name, double price, Provider[] providers, boolean isEligibleForPrime) {
	super();
	this.name = name;
	this.price = price;
	this.providers = providers;
	this.isEligibleForPrime = isEligibleForPrime;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Provider[] getProviders() {
	return providers;
}
public void setProviders(Provider[] providers) {
	this.providers = providers;
}
public boolean isEligibleForPrime() {
	return isEligibleForPrime;
}
public void setEligibleForPrime(boolean isEligibleForPrime) {
	this.isEligibleForPrime = isEligibleForPrime;
}
}
