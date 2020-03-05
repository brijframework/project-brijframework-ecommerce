package com.brijframework.useraccount.entities.account;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EORoleDetail;

@Entity
@Table(name = "USER_ROLE")
public class EOUserRole extends EntityObject<Long> {

	private static final long serialVersionUID = 1L;

	@OneToOne()
	@JoinColumn(name = "ROLE_ID")
	private EORoleDetail roleDetail;

	@ManyToOne()
	@JoinColumn(name = "ACCOUNT_ID")
	private EOUserAccount userAccount;

	public EORoleDetail getRoleDetail() {
		return roleDetail;
	}

	public void setRoleDetail(EORoleDetail roleDetail) {
		this.roleDetail = roleDetail;
	}

	public EOUserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(EOUserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
}
