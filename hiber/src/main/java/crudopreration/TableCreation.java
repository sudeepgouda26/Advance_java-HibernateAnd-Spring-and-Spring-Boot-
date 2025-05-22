package crudopreration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class TableCreation {

	@Id
  int id;
	@Column(nullable = false , unique = false)
  String Name;
	@Column(nullable = false , unique = true)
  long phoneno;
	public int getId() {
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	

}
