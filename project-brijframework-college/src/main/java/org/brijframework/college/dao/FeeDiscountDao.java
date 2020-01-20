package org.brijframework.college.dao;

import java.util.Date;
import java.util.List;

import org.brijframework.college.model.FeeDiscount;

public interface FeeDiscountDao extends DAO<Integer, FeeDiscount> {
	public List<FeeDiscount> getFeeDiscountDTOs(int classId, int sectioId,
			Integer studentAdmissionNo, Date fromDate, Date toDate);

	public List<FeeDiscount> getFeeDiscountDTOs(int classId, int sectioId,
			Integer studentAdmissionNo, Date lastDate);

	public List<FeeDiscount> getDiscountAmountByMonth(Date frmDate, Date toDate);
}
