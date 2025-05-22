package connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="Matchdetails")
public class TableCreation {
	@Id
	private int matchId;
	@Column(nullable = false ,unique =false) 
	private String matchLocation;
	@Column(nullable = false ,unique =false)
	private int matchPrice;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getMatchLocation() {
		return matchLocation;
	}
	public void setMatchLocation(String matchLocation) {
		this.matchLocation = matchLocation;
	}
	public int getMatchPrice() {
		return matchPrice;
	}
	public void setMatchPrice(int matchPrice) {
		this.matchPrice = matchPrice;
	}
	
}
