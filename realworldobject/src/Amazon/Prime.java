package Amazon;

import java.util.Date;

public class Prime {
  private boolean isPrime;
  private String TypeOfMembership;
  private Date renewalDate;
  private String[] watchList;
  private String[] suggestions;
  private String[] languages;
public Prime(boolean isPrime, String typeOfMembership, Date renewalDate, String[] watchList, String[] suggestions,
		String[] languages) {
	super();
	this.isPrime = isPrime;
	TypeOfMembership = typeOfMembership;
	this.renewalDate = renewalDate;
	this.watchList = watchList;
	this.suggestions = suggestions;
	this.languages = languages;
}
public boolean isPrime() {
	return isPrime;
}
public void setPrime(boolean isPrime) {
	this.isPrime = isPrime;
}
public String getTypeOfMembership() {
	return TypeOfMembership;
}
public void setTypeOfMembership(String typeOfMembership) {
	TypeOfMembership = typeOfMembership;
}
public Date getRenewalDate() {
	return renewalDate;
}
public void setRenewalDate(Date renewalDate) {
	this.renewalDate = renewalDate;
}
public String[] getWatchList() {
	return watchList;
}
public void setWatchList(String[] watchList) {
	this.watchList = watchList;
}
public String[] getSuggestions() {
	return suggestions;
}
public void setSuggestions(String[] suggestions) {
	this.suggestions = suggestions;
}
public String[] getLanguages() {
	return languages;
}
public void setLanguages(String[] languages) {
	this.languages = languages;
}
}
