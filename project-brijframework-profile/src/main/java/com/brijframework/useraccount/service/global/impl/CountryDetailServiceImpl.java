package com.brijframework.useraccount.service.global.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.CountryDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CountryDetailResponse;
import com.brijframework.useraccount.entities.global.EOCountryDetail;
import com.brijframework.useraccount.mapper.global.CountryDetailRQRSMapper;
import com.brijframework.useraccount.repository.global.CountryDetailRepository;
import com.brijframework.useraccount.service.global.CountryDetailService;

@Service
public class CountryDetailServiceImpl implements CountryDetailService {
	
	@Autowired
	private CountryDetailRepository cityDetailRepository;
	
	@Autowired
	private CountryDetailRQRSMapper cityDetailMapper;

	@Override
	public CountryDetailResponse saveCountryDetail(CountryDetailRequest cityDetailRequest) {
		EOCountryDetail eoCountryDetail = cityDetailMapper.mapToDAO(cityDetailRequest);
		cityDetailRepository.save(eoCountryDetail);
		return cityDetailMapper.mapToDTO(eoCountryDetail);
	}

	@Override
	public CountryDetailResponse getCountryDetail(long id) {
		return cityDetailMapper.mapToDTO(cityDetailRepository.findById(id).orElseGet(null));
	}

	@Override
	public boolean deleteCountryDetail(Long id) {
		Optional<EOCountryDetail> findById = cityDetailRepository.findById(id);
		if(findById.isPresent()) {
			findById.get().setActive(false);
			cityDetailRepository.save(findById.get());
			return true;
		}
		return false;
	}

}
