package com.brijframework.school.domain.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_role")
public class EmployeeRole extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_role_id")
	private Integer employeeRoleId;
	@Column(name = "employee_role")
	private String roleName;
	@Column(name = "is_active")
	private boolean active;

	public Integer getEmployeeRoleId() {
		return employeeRoleId;
	}

	public void setEmployeeRoleId(Integer employeeRoleId) {
		this.employeeRoleId = employeeRoleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	

}
