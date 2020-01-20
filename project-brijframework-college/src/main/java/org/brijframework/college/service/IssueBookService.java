package org.brijframework.college.service;

import java.util.List;

import org.brijframework.college.model.IssueBook;
import org.brijframework.college.models.dto.IssueBookDTO;

public interface IssueBookService extends CRUDService<Integer,IssueBook> {

	List<IssueBookDTO> getIssuedBookByStudentId(Integer studentId);
	
	List<IssueBookDTO> getIssuedBookByStudentBookId(Integer bookId);

	void issueBookToStudent(int bookId, int admissionNo,String isbn);

	List<IssueBookDTO> getIssueBookToStudent(String bookName, int bookId,
			int admissionNo);

	void returnBookToLibarary(int bookId);
	
	

}
