package Dto.com;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Flower {
	@Column(nullable = false,unique = false)
	private String FlowerName;
	@Column(nullable = false,unique = false)
	 private String FlowerColor;
	@Column(nullable = false,unique = false)
	 private int price;
	 @javax.persistence.Id
	 private String Id;
	public String getFlowerName() {
		return FlowerName;
	}
	public void setFlowerName(String flowerName) {
		FlowerName = flowerName;
	}
	public String getFlowerColor() {
		return FlowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		FlowerColor = flowerColor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}

}
