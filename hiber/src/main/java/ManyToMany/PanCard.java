package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="pancard_table1")
public class PanCard {
	@Id
	private String pancardId;
	@Column(nullable = false, unique = false)
	private String name;
	@Column(nullable = false, unique = false)
	
	private String address;
	@OneToMany
	private List<BankAccounts> bankAccounts;
	public String getPancardId() {
		return pancardId;
	}
	public void setPancardId(String pancardId) {
		this.pancardId = pancardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<BankAccounts> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccounts> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	

}
