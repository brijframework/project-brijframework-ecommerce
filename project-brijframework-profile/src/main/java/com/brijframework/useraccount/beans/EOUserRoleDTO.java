package com.brijframework.useraccount.beans;

public class EOUserRoleDTO extends AbstractDTO<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EORoleDetailDTO roleDetail;

	private EOUserAccountDTO userAccount;

	public EORoleDetailDTO getRoleDetail() {
		return roleDetail;
	}

	public void setRoleDetail(EORoleDetailDTO roleDetail) {
		this.roleDetail = roleDetail;
	}

	public EOUserAccountDTO getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(EOUserAccountDTO userAccount) {
		this.userAccount = userAccount;
	}

}
