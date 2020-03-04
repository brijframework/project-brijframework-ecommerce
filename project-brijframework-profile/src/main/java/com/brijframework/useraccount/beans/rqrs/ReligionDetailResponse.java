package com.brijframework.useraccount.beans.rqrs;

import com.brijframework.useraccount.beans.AbstractDTO;

public class ReligionDetailResponse  extends AbstractDTO<Long>{

	 /* 
	 */
	private static final long serialVersionUID = 1L;
	
	private String religionName;
	
	private String religionDesc;

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

}
