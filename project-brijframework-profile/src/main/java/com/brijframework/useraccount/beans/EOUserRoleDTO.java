package com.brijframework.useraccount.beans;

public class EOUserRoleDTO extends AbstractDTO<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int position;

	private String roleName;

	private String roleID;

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

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	
	

}
