package javax.persistience;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wallet {
	
	@Id
	@GeneratedValue
	private int wid;
	private int amount;
	
	@OneToOne
	@JoinColumn(name="customerID")
	private Customer customer;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Wallet [wid=" + wid + ", amount=" + amount + ", customer=" + customer + "]";
	}
}
