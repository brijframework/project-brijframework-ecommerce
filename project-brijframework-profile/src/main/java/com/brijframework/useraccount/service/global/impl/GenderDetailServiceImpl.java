package com.brijframework.useraccount.service.global.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.GenderDetailRequest;
import com.brijframework.useraccount.beans.rqrs.GenderDetailResponse;
import com.brijframework.useraccount.entities.global.EOGenderDetail;
import com.brijframework.useraccount.mapper.global.GenderDetailMapper;
import com.brijframework.useraccount.repository.global.GenderDetailRepository;
import com.brijframework.useraccount.service.global.GenderDetailService;

@Service
public class GenderDetailServiceImpl implements GenderDetailService{

	@Autowired
	private GenderDetailMapper genderDetailMapper;
	
	@Autowired
	private GenderDetailRepository genderDetailRepository;
	
	@Override
	public GenderDetailResponse saveGenderDetail(GenderDetailRequest GenderDetailRequest) {
		EOGenderDetail eoGenderDetail = genderDetailMapper.mapToDAO(GenderDetailRequest);
		eoGenderDetail.setActive(true);
		eoGenderDetail= genderDetailRepository.save(eoGenderDetail);
		return genderDetailMapper.mapToDTO(eoGenderDetail);
	}

	@Override
	public GenderDetailResponse getGenderDetail(long id) {
		return genderDetailMapper.mapToDTO(genderDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteGenderDetail(Long id) {
		EOGenderDetail eoGenderDetail = genderDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoGenderDetail.setActive(false);
		genderDetailRepository.save(eoGenderDetail);
		return true;
	}
}
