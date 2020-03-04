package com.brijframework.useraccount.entities.account;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EODocumentDetail;

@Entity
@Table(name = "USER_DOCUMENT")
public class EOUserDocument extends EntityObject<Long>  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "DOC_DETAIL_ID")
	private EODocumentDetail documentDetail;

	@ManyToOne
	@JoinColumn(name = "USER_PROFILE_ID")
	private EOUserProfile userProfile;
	
	public EODocumentDetail getDocumentDetail() {
		return documentDetail;
	}

	public void setDocumentDetail(EODocumentDetail documentDetail) {
		this.documentDetail = documentDetail;
	}

	public EOUserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
