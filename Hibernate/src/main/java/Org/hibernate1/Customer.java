package Org.hibernate1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int cid;
	private String cName;
	private String Email;
	private int mobile;

	@ManyToMany(mappedBy = "Cust", cascade = CascadeType.ALL)
	private List<Items> items;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", Email=" + Email + ", mobile=" + mobile + ", items="
				+ items + "]";
	}

}
