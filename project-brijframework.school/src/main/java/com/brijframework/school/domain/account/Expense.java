package com.brijframework.school.domain.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "expenses")
public class Expense extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "expenses_id")
	private Integer expensesId;
	@Column(name = "employee_role")
	private String employeeRole;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "expense_amount")
	private Float expenseAmount;
	@Column(name = "purpose_details")
	private String purposeDetails;
	@Column(name = "date")
	private Date date;
	@Column(name = "is_active")
	private boolean active;

	public Integer getExpensesId() {
		return expensesId;
	}

	public void setExpensesId(Integer expensesId) {
		this.expensesId = expensesId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Float getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(Float expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getPurposeDetails() {
		return purposeDetails;
	}

	public void setPurposeDetails(String purposeDetails) {
		this.purposeDetails = purposeDetails;
	}

}
