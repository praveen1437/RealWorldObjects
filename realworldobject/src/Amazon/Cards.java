package Amazon;

import java.util.Date;

public class Cards {
 private long cardNumber;
 private String bankName;
 private String cardType;
 private String nameOnTheCard;
 private Date expiryDate;
public Cards(long cardNumber, String bankName, String cardType, String nameOnTheCard, Date expiryDate) {
	super();
	this.cardNumber = cardNumber;
	this.bankName = bankName;
	this.cardType = cardType;
	this.nameOnTheCard = nameOnTheCard;
	this.expiryDate = expiryDate;
}
public long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public String getNameOnTheCard() {
	return nameOnTheCard;
}
public void setNameOnTheCard(String nameOnTheCard) {
	this.nameOnTheCard = nameOnTheCard;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
}
