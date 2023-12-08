package Org.hibernate1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Items {
	
	 @Id  
	 @GeneratedValue
	 private int itemId;
	 private int itemPrice;
	 private String itemName;
	 private String Modelname;
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 private List<Customer> Cust;

	 public int getItemId() {
			return itemId;
		}

	public void setItemId(int itemId) {
			this.itemId = itemId;
		}
	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int string) {
		this.itemPrice = string;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getModelname() {
		return Modelname;
	}

	public void setModelname(String modelname) {
		Modelname = modelname;
	}

	public List<Customer> getCust() {
		return Cust;
	}

	public void setCust(List<Customer> cust) {
		Cust = cust;
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemPrice=" + itemPrice + ", itemName=" + itemName + ", Modelname="
				+ Modelname + ", Cust=" + Cust + "]";
	}
}