package com.brijframework.useraccount.beans.rqrs;

import com.brijframework.useraccount.beans.AbstractDTO;

public class UserAddressRequest  extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long profileId;

	private AddressRequest address;

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public AddressRequest getAddress() {
		return address;
	}

	public void setAddress(AddressRequest address) {
		this.address = address;
	}

}
