package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.CityDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CityDetailResponse;

public interface CityDetailService {

	CityDetailResponse saveCityDetail(CityDetailRequest cityDetailRequest);

	CityDetailResponse getCityDetail(long id);

	boolean deleteCityDetail(Long id);

	List<CityDetailResponse> getCityDetailList();

}
