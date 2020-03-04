package com.brijframework.useraccount.beans.rqrs;

import com.brijframework.useraccount.beans.AbstractDTO;

public class UserImgDetailRequest  extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long imgDetailId;

	private Long userProfileId;

	public Long getImgDetailId() {
		return imgDetailId;
	}

	public void setImgDetailId(Long imgDetailId) {
		this.imgDetailId = imgDetailId;
	}

	public Long getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Long userProfileId) {
		this.userProfileId = userProfileId;
	}
	
	
}
