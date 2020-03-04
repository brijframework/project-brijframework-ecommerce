package com.brijframework.useraccount.beans;

public class EOUserLoginDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;

	private String password;
	
	private EOUserRoleDTO role;
	
	private String type;

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

	public EOUserRoleDTO getRole() {
		return role;
	}

	public void setRole(EOUserRoleDTO role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
