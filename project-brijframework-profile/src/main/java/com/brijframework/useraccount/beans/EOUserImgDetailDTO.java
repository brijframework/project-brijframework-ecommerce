package com.brijframework.useraccount.beans;

public class EOUserImgDetailDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EOImgDetailDTO imgDetail;
	
	private EOUserProfileDTO userProfile;

	public EOImgDetailDTO getImgDetail() {
		return imgDetail;
	}

	public void setImgDetail(EOImgDetailDTO imgDetail) {
		this.imgDetail = imgDetail;
	}

	public EOUserProfileDTO getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfileDTO userProfile) {
		this.userProfile = userProfile;
	}

}
