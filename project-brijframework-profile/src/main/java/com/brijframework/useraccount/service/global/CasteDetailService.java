package com.brijframework.useraccount.service.global;

import com.brijframework.useraccount.beans.rqrs.CasteDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CasteDetailResponse;

public interface CasteDetailService {

	CasteDetailResponse saveCasteDetail(CasteDetailRequest CasteDetailRequest);

	CasteDetailResponse getCasteDetail(long id);

	boolean deleteCasteDetail(Long id);

}
