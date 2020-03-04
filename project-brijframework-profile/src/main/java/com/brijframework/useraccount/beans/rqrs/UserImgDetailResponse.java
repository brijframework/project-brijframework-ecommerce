package com.brijframework.useraccount.beans.rqrs;

import com.brijframework.useraccount.beans.AbstractDTO;
import com.brijframework.useraccount.beans.EOImgDetailDTO;
import com.brijframework.useraccount.beans.EOUserProfileDTO;

public class UserImgDetailResponse extends AbstractDTO<Long> {

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
