package com.brijframework.useraccount.entities.account;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EODocumentDetail;

@Entity
@Table(name = "USER_IMG_DETAIL")
public class EOUserImgDetail extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "IMG_DETAIL_ID")
	private EODocumentDetail imgDetail;

	@ManyToOne
	@JoinColumn(name = "USER_PROFILE_ID")
	private EOUserProfile userProfile;

	public EODocumentDetail getImgDetail() {
		return imgDetail;
	}

	public void setImgDetail(EODocumentDetail imgDetail) {
		this.imgDetail = imgDetail;
	}

	public EOUserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
