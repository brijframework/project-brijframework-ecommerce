package com.brijframework.useraccount.service.global.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.ReligionDetailRequest;
import com.brijframework.useraccount.beans.rqrs.ReligionDetailResponse;
import com.brijframework.useraccount.entities.global.EOReligionDetail;
import com.brijframework.useraccount.mapper.global.ReligionDetailMapper;
import com.brijframework.useraccount.repository.global.ReligionDetailRepository;
import com.brijframework.useraccount.service.global.ReligionDetailService;

@Service
public class ReligionDetailServiceImpl implements ReligionDetailService{

	@Autowired
	private ReligionDetailMapper religionDetailMapper;
	
	@Autowired
	private ReligionDetailRepository religionDetailRepository;
	
	@Override
	public ReligionDetailResponse saveReligionDetail(ReligionDetailRequest ReligionDetailRequest) {
		EOReligionDetail eoReligionDetail = religionDetailMapper.mapToDAO(ReligionDetailRequest);
		eoReligionDetail.setActive(true);
		eoReligionDetail= religionDetailRepository.save(eoReligionDetail);
		return religionDetailMapper.mapToDTO(eoReligionDetail);
	}

	@Override
	public ReligionDetailResponse getReligionDetail(long id) {
		return religionDetailMapper.mapToDTO(religionDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteReligionDetail(Long id) {
		EOReligionDetail eoReligionDetail = religionDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoReligionDetail.setActive(false);
		religionDetailRepository.save(eoReligionDetail);
		return true;
	}
}
