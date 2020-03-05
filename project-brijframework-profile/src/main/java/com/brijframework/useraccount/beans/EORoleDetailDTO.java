package com.brijframework.useraccount.beans;

public class EORoleDetailDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int position;

	private String roleName;

	private String roleId;

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
		return "EORoleDetailDTO [id=" + getId() + ", position=" + position + ", roleName=" + roleName + ", roleID=" + roleId;
	}
}
