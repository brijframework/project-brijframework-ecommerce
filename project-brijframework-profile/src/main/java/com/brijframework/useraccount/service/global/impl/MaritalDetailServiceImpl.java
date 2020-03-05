package com.brijframework.useraccount.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.MaritalDetailRequest;
import com.brijframework.useraccount.beans.rqrs.MaritalDetailResponse;
import com.brijframework.useraccount.entities.global.EOMaritalDetail;
import com.brijframework.useraccount.mapper.global.MaritalDetailMapper;
import com.brijframework.useraccount.repository.global.MaritalDetailRepository;
import com.brijframework.useraccount.service.global.MaritalDetailService;

@Service
public class MaritalDetailServiceImpl implements MaritalDetailService{

	@Autowired
	private MaritalDetailMapper maritalDetailMapper;
	
	@Autowired
	private MaritalDetailRepository maritalDetailRepository;
	
	@Override
	public MaritalDetailResponse saveMaritalDetail(MaritalDetailRequest MaritalDetailRequest) {
		EOMaritalDetail eoMaritalDetail = maritalDetailMapper.mapToDAO(MaritalDetailRequest);
		eoMaritalDetail.setActive(true);
		eoMaritalDetail= maritalDetailRepository.save(eoMaritalDetail);
		return maritalDetailMapper.mapToDTO(eoMaritalDetail);
	}

	@Override
	public MaritalDetailResponse getMaritalDetail(long id) {
		return maritalDetailMapper.mapToDTO(maritalDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteMaritalDetail(Long id) {
		EOMaritalDetail eoMaritalDetail = maritalDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoMaritalDetail.setActive(false);
		maritalDetailRepository.save(eoMaritalDetail);
		return true;
	}
	
	@Override
	public List<MaritalDetailResponse> getMaritalDetailList() {
		return maritalDetailMapper.mapToDTO(maritalDetailRepository.findAll());
	}
}
