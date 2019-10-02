package Amazon;

public class Customer {
private String customerName;
private String mailId;
private String passWord;
private long mobileNo;
private String custId;
private boolean isPrime;
private Prime prime;
private Cards[] savedCards;
private Address[] address;
private Cart cart;
public Customer(String customerName, String mailId, String passWord, long mobileNo, String custId, boolean isPrime,
		Prime prime, Cards[] savedCards, Address[] address, Cart cart) {
	super();
	this.customerName = customerName;
	this.mailId = mailId;
	this.passWord = passWord;
	this.mobileNo = mobileNo;
	this.custId = custId;
	this.isPrime = isPrime;
	this.prime = prime;
	this.savedCards = savedCards;
	this.address = address;
	this.cart = cart;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getCustId() {
	return custId;
}
public void setCustId(String custId) {
	this.custId = custId;
}
public boolean isPrime() {
	return isPrime;
}
public void setPrime(boolean isPrime) {
	this.isPrime = isPrime;
}
public Prime getPrime() {
	return prime;
}
public void setPrime(Prime prime) {
	this.prime = prime;
}
public Cards[] getSavedCards() {
	return savedCards;
}
public void setSavedCards(Cards[] savedCards) {
	this.savedCards = savedCards;
}
public Address[] getAddress() {
	return address;
}
public void setAddress(Address[] address) {
	this.address = address;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
}
