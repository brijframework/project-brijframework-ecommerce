package com.brijframework.useraccount.entities.account;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EOAddressDetail;

@Entity
@Table(name = "USER_ADDRESS")
public class EOUserAddress extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "ADDRESS_DETAIL_ID")
	@OneToOne
	private EOAddressDetail addressDetail;
	
	@JoinColumn(name = "USER_PROFILE_ID")
	@ManyToOne
	private EOUserProfile userProfile;

	public EOUserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public EOAddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(EOAddressDetail addressDetail) {
		this.addressDetail = addressDetail;
	}
	
	
}
