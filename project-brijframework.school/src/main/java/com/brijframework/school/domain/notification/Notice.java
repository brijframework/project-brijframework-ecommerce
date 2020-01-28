package com.brijframework.school.domain.notification;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "notice")
public class Notice extends EntityObject<Long> {
	
	@Column(name = "notice_subject")
	private String noticeSubject;
	
	@Column(name = "notice_date")
	private Date noticeDate;
	
	@Column(name = "notice_description")
	private String noticeDescription;
	
	@Column(name = "genrated_by")
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
