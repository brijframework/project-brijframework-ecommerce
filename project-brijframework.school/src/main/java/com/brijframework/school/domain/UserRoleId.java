package com.brijframework.school.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserRoleId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "USER_ID", nullable = false)
	private int userId;
	@Column(name = "ROLE_ID", nullable = false)
	private int roleId;

	public UserRoleId() {
	}

	public UserRoleId(int userId, int roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleId))
			return false;
		UserRoleId castOther = (UserRoleId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getRoleId() == castOther.getRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getRoleId();
		return result;
	}

}
