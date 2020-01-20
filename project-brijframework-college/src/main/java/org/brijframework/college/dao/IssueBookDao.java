package org.brijframework.college.dao;

import java.util.List;

import org.brijframework.college.model.IssueBook;


public interface IssueBookDao extends DAO<Integer, IssueBook>{

	List<IssueBook> getIssuedBookByStudentId(Integer studentId);

	

}
