package day5;

public class BankAccount {
	private String account_name;
	private long account_num;
	private int password;
	private double balance;
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public long getAccount_num() {
		return account_num;
	}
	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void accountDetails() {
		System.out.println(this.account_name+"\n"+this.account_num+"\n"+this.balance+"\n"+this.password);
	}
}
