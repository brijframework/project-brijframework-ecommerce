package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.DocumentDetailRequest;
import com.brijframework.useraccount.beans.rqrs.DocumentDetailResponse;

public interface DocumentDetailService {

	DocumentDetailResponse saveDocumentDetail(DocumentDetailRequest documentDetailRequest);

	DocumentDetailResponse getDocumentDetail(long id);

	boolean deleteDocumentDetail(Long id);

	List<DocumentDetailResponse> getDocumentDetailList();

}
