package ProjectPackage;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Serializable {
	@SerializedName("username")
	@Expose
	String username;
	@SerializedName("password")
	@Expose
	String password;
	@SerializedName("stats")
	@Expose
	Statistics stats;
	@SerializedName("invites")
	@Expose
	ArrayList<String> invites;
	@SerializedName("currGame")
	@Expose
	String currGame;
	
	private final static long serialVersionUID = -5659000743766857262L;
	
	public User(String username, String password, Statistics stats, ArrayList<String> invites, String currGame) {
		this.username = username;
		this.password = password;
		this.stats = stats;
		this.invites = invites;
		this.currGame = currGame;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setStats(Statistics stats) {
		this.stats = stats;
	}
	
	public Statistics getStats() {
		return stats;
	}

	public ArrayList<String> getInvites() {
		return invites;
	}

	public void setInvites(ArrayList<String> invites) {
		this.invites = invites;
	}

	public String getCurrGame() {
		return currGame;
	}

	public void setCurrGame(String currGame) {
		this.currGame = currGame;
	}
	
	public void addInvite(String gameID) {
		invites.add(gameID);
	}
	
}











