package com.brijframework.school.domain.comman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "DOCUMENT_CATEGORY")
public class DocumentsCategory extends EntityObject<Integer> {

	@Column(name = "NAME")
	private String name;

	@Column(name = "TYPE")
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
