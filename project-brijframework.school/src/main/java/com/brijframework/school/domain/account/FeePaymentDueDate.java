package com.brijframework.school.domain.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.exam.Month;

@SuppressWarnings("serial")
@Entity
@Table(name ="payment_due_date")
public class FeePaymentDueDate extends EntityObject<Integer>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "lastdate_id")
	private Integer lastdateId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "month_id")
	private Month month;
	@Column(name = "lastdate")
	private Date lastdate;
	public Integer getLastdateId() {
		return lastdateId;
	}
	public void setLastdateId(Integer lastdateId) {
		this.lastdateId = lastdateId;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public Date getLastdate() {
		return lastdate;
	}
	public void setLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}
	
}
