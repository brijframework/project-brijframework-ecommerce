package com.brijframework.useraccount.service.global;

import com.brijframework.useraccount.beans.rqrs.ReligionDetailRequest;
import com.brijframework.useraccount.beans.rqrs.ReligionDetailResponse;

public interface ReligionDetailService {

	ReligionDetailResponse saveReligionDetail(ReligionDetailRequest ReligionDetailRequest);

	ReligionDetailResponse getReligionDetail(long id);

	boolean deleteReligionDetail(Long id);

}
