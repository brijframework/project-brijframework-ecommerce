package com.brijframework.school.domain.visitor;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.location.Address;

@SuppressWarnings("serial")
@Entity
@Table(name = "VISITOR_DETAIL")
public class VisitorsDetail extends EntityObject<Long> {
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "MOBILE_NO")
	private String mobileNo;
	
	@Column(name = "PURPOSE")
	private String purpose;
	
	@Column(name = "TO_MEET")
	private String toMeet;
	
	@Column(name = "IN_TIME")
	private Time inTime;
	
	@Column(name = "OUT_TIME")
	private Time outTime;
	
	@Column(name = "VISIT_DATE")
	private Date visitDate;
	
	@JoinColumn(name = "ADDRESS_ID")
	@OneToOne
	private Address address;
	
}
