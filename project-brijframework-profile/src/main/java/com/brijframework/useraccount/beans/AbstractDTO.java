package com.brijframework.useraccount.beans;

import java.io.Serializable;

public class AbstractDTO<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

}
