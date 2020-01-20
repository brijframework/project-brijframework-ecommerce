package org.brijframework.college.model;

import java.io.Serializable;

public class AbstractPO<I extends Serializable> implements PO<I>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private I id;
	
	@Override
	public I getId() {
		return id;
	}

	@Override
	public void setId(I id) {
		this.id=id;
	}

}
