package com.brijframework.useraccount.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.AddressDetailRequest;
import com.brijframework.useraccount.beans.rqrs.AddressDetailResponse;
import com.brijframework.useraccount.entities.global.EOAddressDetail;
import com.brijframework.useraccount.mapper.global.AddressDetailMapper;
import com.brijframework.useraccount.repository.global.AddressDetailRepository;
import com.brijframework.useraccount.service.global.AddressDetailService;

@Service
public class AddressDetailServiceImpl implements AddressDetailService{

	@Autowired
	private AddressDetailMapper addressDetailMapper;
	
	@Autowired
	private AddressDetailRepository addressDetailRepository;
	
	@Override
	public AddressDetailResponse saveAddressDetail(AddressDetailRequest AddressDetailRequest) {
		EOAddressDetail eoAddressDetail = addressDetailMapper.mapToDAO(AddressDetailRequest);
		eoAddressDetail.setActive(true);
		eoAddressDetail= addressDetailRepository.save(eoAddressDetail);
		return addressDetailMapper.mapToDTO(eoAddressDetail);
	}

	@Override
	public AddressDetailResponse getAddressDetail(long id) {
		return addressDetailMapper.mapToDTO(addressDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteAddressDetail(Long id) {
		EOAddressDetail eoAddressDetail = addressDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoAddressDetail.setActive(false);
		addressDetailRepository.save(eoAddressDetail);
		return true;
	}
	
	@Override
	public List<AddressDetailResponse> getAddressDetailList() {
		return addressDetailMapper.mapToDTO(addressDetailRepository.findAll());
	}
}
