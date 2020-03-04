package com.brijframework.useraccount.service.global;

import com.brijframework.useraccount.beans.rqrs.GenderDetailRequest;
import com.brijframework.useraccount.beans.rqrs.GenderDetailResponse;

public interface GenderDetailService {

	GenderDetailResponse saveGenderDetail(GenderDetailRequest GenderDetailRequest);

	GenderDetailResponse getGenderDetail(long id);

	boolean deleteGenderDetail(Long id);

}
