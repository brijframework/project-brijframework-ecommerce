package org.brijframework.college.dao.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.brijframework.college.dao.GatePassDao;
import org.brijframework.college.model.GatePass;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("gatePassDao")
public class GatePassDaoImpl extends DAOImpl<Integer, GatePass> implements
		GatePassDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<GatePass> findPreviousDetailsById(Integer id) {
		return sessionFactory.getCurrentSession()
				.createCriteria(GatePass.class)
				.add(Restrictions.eq("students.studentAdmissionNo", id)).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GatePass> findDateWiseDetails(Date leavingDate) {
		 Calendar leavingDateCT = Calendar.getInstance();
		 leavingDateCT.setTime(leavingDate);
		 leavingDateCT.set(Calendar.SECOND, 00);
		 leavingDateCT.set(Calendar.MINUTE, 00);
		 leavingDateCT.set(Calendar.HOUR, 00);
		 Date st = leavingDateCT.getTime();
		 System.out.println(st);
		 leavingDateCT.set(Calendar.SECOND, 59);
		 leavingDateCT.set(Calendar.MINUTE, 59);
		 leavingDateCT.set(Calendar.HOUR, 11);
		 Date ed = leavingDateCT.getTime();
		 System.out.println(ed);
		return sessionFactory.getCurrentSession()
				.createCriteria(GatePass.class)
				.add(Restrictions.ge("leavingDate",st)).add(Restrictions.le("leavingDate",ed)).list();
	}

}
