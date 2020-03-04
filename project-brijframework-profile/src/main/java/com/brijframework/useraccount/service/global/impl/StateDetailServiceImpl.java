package com.brijframework.useraccount.service.global.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.StateDetailRequest;
import com.brijframework.useraccount.beans.rqrs.StateDetailResponse;
import com.brijframework.useraccount.entities.global.EOStateDetail;
import com.brijframework.useraccount.mapper.global.StateDetailMapper;
import com.brijframework.useraccount.repository.global.StateDetailRepository;
import com.brijframework.useraccount.service.global.StateDetailService;

@Service
public class StateDetailServiceImpl implements StateDetailService{

	@Autowired
	private StateDetailMapper stateDetailMapper;
	
	@Autowired
	private StateDetailRepository stateDetailRepository;
	
	@Override
	public StateDetailResponse saveStateDetail(StateDetailRequest StateDetailRequest) {
		EOStateDetail eoStateDetail = stateDetailMapper.mapToDAO(StateDetailRequest);
		eoStateDetail.setActive(true);
		eoStateDetail= stateDetailRepository.save(eoStateDetail);
		return stateDetailMapper.mapToDTO(eoStateDetail);
	}

	@Override
	public StateDetailResponse getStateDetail(long id) {
		return stateDetailMapper.mapToDTO(stateDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteStateDetail(Long id) {
		EOStateDetail eoStateDetail = stateDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoStateDetail.setActive(false);
		stateDetailRepository.save(eoStateDetail);
		return true;
	}
}
