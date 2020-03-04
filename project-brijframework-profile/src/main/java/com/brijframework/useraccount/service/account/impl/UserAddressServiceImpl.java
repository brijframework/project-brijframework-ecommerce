package com.brijframework.useraccount.service.account.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;
import com.brijframework.useraccount.entities.account.EOUserAddress;
import com.brijframework.useraccount.mapper.account.UserAddressMapper;
import com.brijframework.useraccount.repository.account.UserAddressRepository;
import com.brijframework.useraccount.repository.global.AddressDetailRepository;
import com.brijframework.useraccount.service.account.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	UserAddressMapper userAddressMapper;
	
	@Autowired
	UserAddressRepository userAddressRepository;
	
	@Autowired
	AddressDetailRepository addressRepository;
	
	@Override
	public UserAddressResponse saveUserAddress(UserAddressRequest userAddressRequest) {
		EOUserAddress eoUserAddress = userAddressMapper.mapRequestToDAO(userAddressRequest);
		eoUserAddress.setAddressDetail(addressRepository.save(eoUserAddress.getAddressDetail()));
		eoUserAddress= userAddressRepository.save(eoUserAddress);
		return userAddressMapper.mapResponseToDTO(eoUserAddress);
	}

	@Override
	public UserAddressResponse getUserAddress(long id) {
		return userAddressMapper.mapResponseToDTO(userAddressRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteUserAddress(Long id) {
		EOUserAddress eoUserAddress = userAddressRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserAddress.setActive(true);
		userAddressRepository.save(eoUserAddress);
		return true;
	}

}
