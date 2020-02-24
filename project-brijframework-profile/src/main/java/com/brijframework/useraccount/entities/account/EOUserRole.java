package com.brijframework.useraccount.entities.account;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "USER_ROLE")
public class EOUserRole extends EntityObject<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "POSITION")
	private int position;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@Column(name = "ROLE_ID")
	private String roleId;

	@OneToMany(mappedBy = "userRole")
	private List<EOUserAccount> userAccounts;
	
	public EOUserRole() {
	}

	public EOUserRole(int position, String roleName, String roleId) {
		super();
		this.position = position;
		this.roleName = roleName;
		this.roleId = roleId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleID) {
		this.roleId = roleID;
	}

	public List<EOUserAccount> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(List<EOUserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}

	@Override
	public String toString() {
		return "EOUserRole [id=" + getId() + ", position=" + position + ", roleName=" + roleName + ", roleID=" + roleId;
	}

	
}
