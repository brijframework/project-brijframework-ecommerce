package com.brijframework.useraccount.entities.account;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EOCasteDetail;
import com.brijframework.useraccount.entities.global.EOReligionDetail;

@Entity
@Table(name = "USER_RELIGION")
public class EOUserReligion extends EntityObject<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JoinColumn(name = "RELIGION_ID")
	@OneToOne
	private EOReligionDetail religion;
	
	@JoinColumn(name = "CASTE_ID")
	@OneToOne
	private EOCasteDetail caste;

	public EOReligionDetail getReligion() {
		return religion;
	}

	public void setReligion(EOReligionDetail religion) {
		this.religion = religion;
	}

	public EOCasteDetail getCaste() {
		return caste;
	}

	public void setCaste(EOCasteDetail caste) {
		this.caste = caste;
	}
}
