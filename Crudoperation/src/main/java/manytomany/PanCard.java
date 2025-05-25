package manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PanCard {
	@Id
 private String pancard;
	@Column(nullable = false, unique = false);
 private String name;
 @Column(nullable = false, unique = false)
 private String address;
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
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
}
