package ManyToMany;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class BankAccounts {
	@Column(nullable = false, unique = false)
	private String BankName;
	@Id
	private String IfscCode;
	@Column(nullable = false, unique = false)
	private String Address;
	@ManyToOne
	private PanCard p;
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getIfscCode() {
		return IfscCode;
	}
	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public PanCard getP() {
		return p;
	}
	public void setP(PanCard p) {
		this.p = p;
	}

	
}
