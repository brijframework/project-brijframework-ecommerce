package com.brijframework.useraccount.beans;

import java.util.List;

public class EOUserAccountDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;

	private String password;

	private String accountName;

	private String type;

	private EOUserProfileDTO userProfile;

	private List<EOUserRoleDTO> userRoleList;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EOUserProfileDTO getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfileDTO userProfile) {
		this.userProfile = userProfile;
	}

	public List<EOUserRoleDTO> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<EOUserRoleDTO> userRoleList) {
		this.userRoleList = userRoleList;
	}

	@Override
	public String toString() {
		return "EOUserLogin [id=" + getId() + ", username=" + username + ", password=" + password + ", accountName="
				+ accountName + ", type=" + type + ", userProfile=" + userProfile + "]";
	}
	

}
