package com.brijframework.useraccount.beans;

public class EOUserDocumentDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EODocumentDetailDTO documentDetail;

	private EOUserProfileDTO userProfile;
	
	public EODocumentDetailDTO getDocumentDetail() {
		return documentDetail;
	}

	public void setDocumentDetail(EODocumentDetailDTO documentDetail) {
		this.documentDetail = documentDetail;
	}

	public EOUserProfileDTO getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfileDTO userProfile) {
		this.userProfile = userProfile;
	}
}
