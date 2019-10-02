package Amazon;

public class Amazon {
  private static final String COMPANY_NAME="Amazon";
  private static  HAddress headOfOfficeAddress;
  private static  String CEO="Jeff Bezos";
  private Customer[] customers;
  private Courier[] couriers;
  private Employee[] employees;
  private long numberOfEmployes;
  private long numberOfCustomers;
  private PickUpLocation[] pickUpLocations;
public static HAddress getHeadOfOfficeAddress() {
	return headOfOfficeAddress;
}
public static void setHeadOfOfficeAddress(HAddress headOfOfficeAddress) {
	Amazon.headOfOfficeAddress = headOfOfficeAddress;
}
public static String getCEO() {
	return CEO;
}
public static void setCEO(String cEO) {
	CEO = cEO;
}
public Customer[] getCustomers() {
	return customers;
}
public void setCustomers(Customer[] customers) {
	this.customers = customers;
}
public Courier[] getCouriers() {
	return couriers;
}
public void setCouriers(Courier[] couriers) {
	this.couriers = couriers;
}
public Employee[] getEmployees() {
	return employees;
}
public void setEmployees(Employee[] employees) {
	this.employees = employees;
}
public long getNumberOfEmployes() {
	return numberOfEmployes;
}
public void setNumberOfEmployes(long numberOfEmployes) {
	this.numberOfEmployes = numberOfEmployes;
}
public long getNumberOfCustomers() {
	return numberOfCustomers;
}
public void setNumberOfCustomers(long numberOfCustomers) {
	this.numberOfCustomers = numberOfCustomers;
}
public PickUpLocation[] getPickUpLocations() {
	return pickUpLocations;
}
public void setPickUpLocations(PickUpLocation[] pickUpLocations) {
	this.pickUpLocations = pickUpLocations;
}
public static String getCompanyName() {
	return COMPANY_NAME;
}
public Amazon(Customer[] customers, Courier[] couriers, Employee[] employees, long numberOfEmployes,
		long numberOfCustomers, PickUpLocation[] pickUpLocations) {
	super();
	this.customers = customers;
	this.couriers = couriers;
	this.employees = employees;
	this.numberOfEmployes = numberOfEmployes;
	this.numberOfCustomers = numberOfCustomers;
	this.pickUpLocations = pickUpLocations;
}
  
   
 
}
