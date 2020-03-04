package com.brijframework.useraccount.entities.global;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;

@Entity
@Table(name = "RELIGION_DETAIL")
public class EOReligionDetail extends EntityObject<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "RELIGION_NAME")
	private String religionName;
	
	@Column(name = "RELIGION_DESC")
	private String religionDesc;
	
	@OneToMany(mappedBy = "religion")
	private List<EOCasteDetail> castes;
			
	public String getReligionName() {
		return religionName;
	}

	public void setReligionName(String religionName) {
		this.religionName = religionName;
	}

	public String getReligionDesc() {
		return religionDesc;
	}

	public void setReligionDesc(String religionDesc) {
		this.religionDesc = religionDesc;
	}

	public List<EOCasteDetail> getCastes() {
		return castes;
	}

	public void setCastes(List<EOCasteDetail> castes) {
		this.castes = castes;
	}
	
}
