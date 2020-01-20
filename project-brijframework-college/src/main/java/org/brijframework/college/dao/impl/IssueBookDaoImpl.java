package org.brijframework.college.dao.impl;

import java.util.List;

import org.brijframework.college.dao.IssueBookDao;
import org.brijframework.college.model.IssueBook;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository("issueBookDao")
public class IssueBookDaoImpl extends DAOImpl<Integer, IssueBook> implements IssueBookDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<IssueBook> getIssuedBookByStudentId(Integer studentId) {
		return sessionFactory.getCurrentSession().createCriteria(IssueBook.class).add(Restrictions.eq("active", true))
				.add(Restrictions.eq("student.studentAdmissionNo", studentId)).list();
	}

}
