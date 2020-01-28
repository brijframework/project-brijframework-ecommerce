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
import com.brijframework.school.domain.employee.Employees;
import com.brijframework.school.domain.exam.Month;
import com.brijframework.school.domain.setting.Session;

@SuppressWarnings("serial")
@Entity
@Table(name = "advance_salary")
public class AdvanceSalary extends EntityObject<Integer>{
	@Id
	@Column(name = "advance_salary_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer advanceSalaryId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private Employees employees;
	@Column(name = "is_active")
	private Boolean active;
	@Column(name = "date_of_payment")
	private Date dateOfPayment;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "alloted_month_id")
	private Month month;
	@Column(name = "paid_amount")
	private Integer paidAmount;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id")
	private Session session;
	
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Integer getAdvanceSalaryId() {
		return advanceSalaryId;
	}
	public void setAdvanceSalaryId(Integer advanceSalaryId) {
		this.advanceSalaryId = advanceSalaryId;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Date getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public Integer getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}
	
}
