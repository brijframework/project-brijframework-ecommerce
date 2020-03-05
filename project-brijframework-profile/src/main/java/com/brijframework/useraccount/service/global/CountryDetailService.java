package com.brijframework.useraccount.service.global;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.CountryDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CountryDetailResponse;

public interface CountryDetailService {

	CountryDetailResponse saveCountryDetail(CountryDetailRequest cityDetailRequest);

	CountryDetailResponse getCountryDetail(long id);

	boolean deleteCountryDetail(Long id);

	List<CountryDetailResponse> getCountryDetailList();

}
