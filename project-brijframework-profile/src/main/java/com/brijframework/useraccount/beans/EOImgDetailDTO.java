package com.brijframework.useraccount.beans;

public class EOImgDetailDTO extends AbstractDTO<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fileName;
	private String fileUrl;
	private byte[] fileData;
	private String fileType;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
