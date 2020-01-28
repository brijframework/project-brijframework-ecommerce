package com.brijframework.school.domain.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "month")
public class Month extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "month_id")
	private Integer monthId;
	@Column(name = "month_name")
	private String monthName;
	@Column(name = "serial_no")
	private int serialNo;
	@Column(name = "is_active")
	private boolean active;

	public Integer getMonthId() {
		return monthId;
	}

	public void setMonthId(Integer monthId) {
		this.monthId = monthId;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

}
