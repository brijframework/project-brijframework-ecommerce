package com.brijframework.useraccount.entities.global;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "CASTE_DETAIL")
public class EOCasteDetail extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "CASTE_NAME")
	private String casteName;
	
	@Column(name = "CASTE_DESC")
	private String casteDesc;
	
	@JoinColumn(name="RELIGION_ID")
	@ManyToOne
	private EOReligionDetail religion;

	public String getCasteName() {
		return casteName;
	}

	public void setCasteName(String casteName) {
		this.casteName = casteName;
	}
	
	public String getCasteDesc() {
		return casteDesc;
	}

	public void setCasteDesc(String casteDesc) {
		this.casteDesc = casteDesc;
	}

	public EOReligionDetail getReligion() {
		return religion;
	}

	public void setReligion(EOReligionDetail religion) {
		this.religion = religion;
	}
	
	
}
