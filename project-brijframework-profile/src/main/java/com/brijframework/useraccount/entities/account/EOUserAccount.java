package com.brijframework.useraccount.entities.account;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "USER_ACCOUNT", uniqueConstraints= {@UniqueConstraint(columnNames = { "USERNAME" })})
public class EOUserAccount extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ACCOUNT_NAME")
	private String accountName;

	@Column(name = "TYPE")
	private String type;

	@OneToOne(mappedBy = "userAccount")
	private EOUserProfile userProfile;

	@OneToMany(mappedBy = "userAccount")
	private List<EOUserRole> userRoleList;


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

	public EOUserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public List<EOUserRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<EOUserRole> userRoleList) {
		this.userRoleList = userRoleList;
	}

	@Override
	public String toString() {
		return "EOUserLogin [id=" + getId() + ", username=" + username + ", password=" + password + ", accountName="
				+ accountName + ", type=" + type + ", userProfile=" + userProfile + "]";
	}
	
	

}
