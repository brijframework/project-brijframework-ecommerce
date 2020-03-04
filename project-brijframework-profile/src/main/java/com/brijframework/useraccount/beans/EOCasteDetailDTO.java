package com.brijframework.useraccount.beans;

public class EOCasteDetailDTO extends AbstractDTO<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String casteName;
	
	private String casteDesc;

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
	
}
