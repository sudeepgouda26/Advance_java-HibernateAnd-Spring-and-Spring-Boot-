package biderectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	@Column(nullable = false , unique = false)
	private String name;
	@Column(nullable = false , unique = false)
	private String address;
	@OneToOne
	private Pancard p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Pancard getP() {
		return p;
	}
	public void setP(Pancard p) {
		this.p = p;
	}

}
