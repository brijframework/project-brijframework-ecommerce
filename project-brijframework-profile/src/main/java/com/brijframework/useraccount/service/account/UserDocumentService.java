package com.brijframework.useraccount.service.account;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.UserDocumentRequest;
import com.brijframework.useraccount.beans.rqrs.UserDocumentResponse;

public interface UserDocumentService {

	UserDocumentResponse saveUserDocument(UserDocumentRequest roleRequest);

	List<UserDocumentResponse> getUserDocumentList();

	UserDocumentResponse getUserDocument(Long id);

	boolean deleteUserDocument(Long id);

}
