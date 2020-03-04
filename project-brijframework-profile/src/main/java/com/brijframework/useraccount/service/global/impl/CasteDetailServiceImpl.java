package com.brijframework.useraccount.service.global.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.CasteDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CasteDetailResponse;
import com.brijframework.useraccount.entities.global.EOCasteDetail;
import com.brijframework.useraccount.mapper.global.CasteDetailMapper;
import com.brijframework.useraccount.repository.global.CasteDetailRepository;
import com.brijframework.useraccount.service.global.CasteDetailService;

@Service
public class CasteDetailServiceImpl implements CasteDetailService{

	@Autowired
	private CasteDetailMapper CasteDetailMapper;
	
	@Autowired
	private CasteDetailRepository CasteDetailRepository;
	
	@Override
	public CasteDetailResponse saveCasteDetail(CasteDetailRequest CasteDetailRequest) {
		EOCasteDetail eoCasteDetail = CasteDetailMapper.mapToDAO(CasteDetailRequest);
		eoCasteDetail.setActive(true);
		eoCasteDetail= CasteDetailRepository.save(eoCasteDetail);
		return CasteDetailMapper.mapToDTO(eoCasteDetail);
	}

	@Override
	public CasteDetailResponse getCasteDetail(long id) {
		return CasteDetailMapper.mapToDTO(CasteDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteCasteDetail(Long id) {
		EOCasteDetail eoCasteDetail = CasteDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoCasteDetail.setActive(false);
		CasteDetailRepository.save(eoCasteDetail);
		return true;
	}
}
