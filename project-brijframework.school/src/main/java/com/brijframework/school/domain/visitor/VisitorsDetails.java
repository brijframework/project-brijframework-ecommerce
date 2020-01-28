package com.brijframework.school.domain.visitor;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "visitor_details")
public class VisitorsDetails extends EntityObject<Long> {
	
	@Column(name = "visitor_name")
	private String visitorName;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "purpose")
	private String purpose;
	
	@Column(name = "to_meet")
	private String toMeet;
	
	@Column(name = "in_time")
	private Time inTime;
	
	@Column(name = "out_time")
	private Time outTime;
	
	@Column(name = "visit_date")
	private Date visitDate;
	

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Time getInTime() {
		return inTime;
	}

	public void setInTime(Time inTime) {
		this.inTime = inTime;
	}

	public Time getOutTime() {
		return outTime;
	}

	public void setOutTime(Time outTime) {
		this.outTime = outTime;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public String getToMeet() {
		return toMeet;
	}

	public void setToMeet(String toMeet) {
		this.toMeet = toMeet;
	}

}
