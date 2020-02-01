package com.brijframework.school.domain.notification;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.SessionDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "HOLIDAY")
public class Holiday extends EntityObject<Integer> {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SESSION_DETAIL_ID")
	private SessionDetail sessionDetail;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "HOLIDAY_DATE")
	private Date holidayDate;

}
