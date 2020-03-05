package com.brijframework.useraccount.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public abstract class EntityObject<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private T id;

	@Column(name = "CREATED_UID")
	private String createdUid;

	@Column(name = "CREATED_AT")
	@CreationTimestamp
	private Date createdAt;

	@Column(name = "UPDATED_UID")
	private Date updatedUid;

	@Column(name = "UPDATED_AT")
	@UpdateTimestamp
	private Date updatedAt;

	@Column(name = "IS_ACTIVE")
	private boolean active;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getCreatedUid() {
		return createdUid;
	}

	public void setCreatedUid(String createdUid) {
		this.createdUid = createdUid;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedUid() {
		return updatedUid;
	}

	public void setUpdatedUid(Date updatedUid) {
		this.updatedUid = updatedUid;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
