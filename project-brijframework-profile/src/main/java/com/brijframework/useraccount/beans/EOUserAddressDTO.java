package com.brijframework.useraccount.beans;

public class EOUserAddressDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EOAddressDetailDTO addressDetail;

	private EOUserProfileDTO userProfile;

	public EOUserProfileDTO getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfileDTO userProfile) {
		this.userProfile = userProfile;
	}

	public EOAddressDetailDTO getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(EOAddressDetailDTO addressDetail) {
		this.addressDetail = addressDetail;
	}

}
