package com.brijframework.school.domain.notification;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "NOTICE")
public class Notice extends EntityObject<Long> {
	
	@Column(name = "NOTICE_SUBJECT")
	private String noticeSubject;
	
	@Column(name = "NOTICE_DATE")
	private Date noticeDate;
	
	@Column(name = "NOTICE_DESCRIPTION")
	private String noticeDescription;
	
	@Column(name = "GENRATED_BY")
	private String genratedBy;

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getNoticeDescription() {
		return noticeDescription;
	}

	public void setNoticeDescription(String noticeDescription) {
		this.noticeDescription = noticeDescription;
	}

	public String getGenratedBy() {
		return genratedBy;
	}

	public void setGenratedBy(String genratedBy) {
		this.genratedBy = genratedBy;
	}

}
