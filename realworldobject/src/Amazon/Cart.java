package Amazon;

import java.util.HashMap;

public class Cart {
  private HashMap<Integer,Item> items;

public Cart(HashMap<Integer, Item> items) {
	super();
	this.items = items;
}

public HashMap<Integer, Item> getItems() {
	return items;
}

public void setItems(HashMap<Integer, Item> items) {
	this.items = items;
}
  
}
