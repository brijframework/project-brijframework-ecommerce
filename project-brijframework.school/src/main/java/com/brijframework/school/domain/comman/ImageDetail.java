package com.brijframework.school.domain.comman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "IMAGE_DETAIL")
public class ImageDetail extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "file_name")
	private String fileName;
	
	@Column(name = "file_url")
	private String fileUrl;
	
	@Lob
	@Column(name = "file_data")
	private byte[] fileData;
}
