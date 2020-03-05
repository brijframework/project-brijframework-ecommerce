package com.brijframework.useraccount.beans;

public class EOUserReligionDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EOReligionDetailDTO religion;

	private EOCasteDetailDTO caste;

	public EOReligionDetailDTO getReligion() {
		return religion;
	}

	public void setReligion(EOReligionDetailDTO religion) {
		this.religion = religion;
	}

	public EOCasteDetailDTO getCaste() {
		return caste;
	}

	public void setCaste(EOCasteDetailDTO caste) {
		this.caste = caste;
	}

}
