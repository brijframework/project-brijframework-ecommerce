package org.brijframework.college.dao;

import java.util.List;

import org.brijframework.college.model.ISBN;

public interface IsbnDao  extends DAO<Integer, ISBN>{

	ISBN getISBNbyLibraryBookId(Integer libraryBookId);

	List<ISBN> getBooksISBN_No(int bookId);

	ISBN getISBNByBookIdAndISBNNO(String isbnNo, int bookId);
	
	
	

}
