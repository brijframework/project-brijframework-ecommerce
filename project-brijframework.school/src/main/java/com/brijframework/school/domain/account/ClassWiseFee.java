package com.brijframework.school.domain.account;

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
import com.brijframework.school.domain.setting.Session;
import com.brijframework.school.domain.student.StudentClass;

@SuppressWarnings("serial")
@Entity
@Table(name = "class_wise_fee")
public class ClassWiseFee extends EntityObject<Integer> {
	@Id
	@Column(name = "class_wise_fee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer classWiseFeeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private StudentClass classes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id")
	private Session session;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "month_id")
	private Month month;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private FeesCategories feesCategories;

	@Column(name = "fee_amount")
	private double feeAmount;
	@Column(name = "is_active")
	private boolean active;

	public Integer getClassWiseFeeId() {
		return classWiseFeeId;
	}

	public void setClassWiseFeeId(Integer classWiseFeeId) {
		this.classWiseFeeId = classWiseFeeId;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public FeesCategories getFeesCategories() {
		return feesCategories;
	}

	public void setFeesCategories(FeesCategories feesCategories) {
		this.feesCategories = feesCategories;
	}

	public double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public StudentClass getClasses() {
		return classes;
	}

	public void setClasses(StudentClass classes) {
		this.classes = classes;
	}

}
