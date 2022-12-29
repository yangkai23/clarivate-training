package day5;

public class WhatsApp {
	private String username;
	private long contact_num;
	private String password;
	private String status;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getContact_num() {
		return contact_num;
	}
	public void setContact_num(long contact_num) {
		this.contact_num = contact_num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void userDetails() {
		System.out.println(this.username+"\n"+this.contact_num+"\n"+this.password+"\n"+this.status);
	}
}
