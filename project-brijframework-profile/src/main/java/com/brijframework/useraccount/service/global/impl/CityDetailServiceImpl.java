package com.brijframework.useraccount.service.global.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.CityDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CityDetailResponse;
import com.brijframework.useraccount.entities.global.EOCityDetail;
import com.brijframework.useraccount.mapper.global.CityDetailRQRSMapper;
import com.brijframework.useraccount.repository.global.CityDetailRepository;
import com.brijframework.useraccount.service.global.CityDetailService;

@Service
public class CityDetailServiceImpl implements CityDetailService {
	
	@Autowired
	private CityDetailRepository cityDetailRepository;
	
	@Autowired
	private CityDetailRQRSMapper cityDetailMapper;

	@Override
	public CityDetailResponse saveCityDetail(CityDetailRequest cityDetailRequest) {
		EOCityDetail eoCityDetail = cityDetailMapper.mapToDAO(cityDetailRequest);
		cityDetailRepository.save(eoCityDetail);
		return cityDetailMapper.mapToDTO(eoCityDetail);
	}

	@Override
	public CityDetailResponse getCityDetail(long id) {
		return cityDetailMapper.mapToDTO(cityDetailRepository.findById(id).orElseGet(null));
	}

	@Override
	public boolean deleteCityDetail(Long id) {
		Optional<EOCityDetail> findById = cityDetailRepository.findById(id);
		if(findById.isPresent()) {
			findById.get().setActive(false);
			cityDetailRepository.save(findById.get());
			return true;
		}
		return false;
	}

}
