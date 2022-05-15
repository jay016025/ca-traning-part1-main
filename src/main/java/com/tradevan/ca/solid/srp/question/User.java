package com.tradevan.ca.solid.srp.question;

public class User {

	private int id;
	private String primaryEmail;
	private String secondaryEmail;
	private Role role;

	private Integer amount = 0;

	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	
	public void setSecondaryEmail(String newSecondaryEmail) {
		this.secondaryEmail = newSecondaryEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public void sendMoney(User userTo, int dollarsAmount) {
		// some code here to transfer money
		userTo.amount += dollarsAmount;
		this.amount -= dollarsAmount;
	}

	public Role getRole() {
		return this.role;
	}
	public void setRole(Role role) {this.role = role;}

	public Integer getAmount() {return this.amount;}
	public void setAmount(Integer amount) {this.amount = amount;}
}
