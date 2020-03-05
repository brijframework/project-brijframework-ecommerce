package com.brijframework.useraccount.beans.rqrs;

import com.brijframework.useraccount.beans.AbstractDTO;

public class UserRoleResponse extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long roleId;

	private Long accountId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

}
