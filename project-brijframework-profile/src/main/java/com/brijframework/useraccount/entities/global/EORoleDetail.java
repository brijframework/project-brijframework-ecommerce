package com.brijframework.useraccount.entities.global;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "ROLE_DETAIL")
public class EORoleDetail extends EntityObject<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "POSITION")
	private int position;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@Column(name = "ROLE_ID")
	private String roleId;

	public EORoleDetail() {
	}

	public EORoleDetail(int position, String roleName, String roleId) {
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

	@Override
	public String toString() {
		return "EOUserRole [id=" + getId() + ", position=" + position + ", roleName=" + roleName + ", roleID=" + roleId;
	}

	
}
