package com.brijframework.useraccount.beans.rqrs;

import javax.validation.constraints.NotEmpty;

public class UserAccountRequest {

	private long accountId;

	@NotEmpty
	private String type;

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
