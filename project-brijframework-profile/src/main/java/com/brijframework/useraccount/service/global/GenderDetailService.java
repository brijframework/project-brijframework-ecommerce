package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.GenderDetailRequest;
import com.brijframework.useraccount.beans.rqrs.GenderDetailResponse;

public interface GenderDetailService {

	GenderDetailResponse saveGenderDetail(GenderDetailRequest GenderDetailRequest);

	GenderDetailResponse getGenderDetail(long id);

	boolean deleteGenderDetail(Long id);

	List<GenderDetailResponse> getGenderDetailList();

}
