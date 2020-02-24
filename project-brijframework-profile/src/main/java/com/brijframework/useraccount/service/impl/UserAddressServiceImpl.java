package com.brijframework.useraccount.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;
import com.brijframework.useraccount.entities.account.EOUserAddress;
import com.brijframework.useraccount.mapper.UserAddressMapper;
import com.brijframework.useraccount.repository.AddressRepository;
import com.brijframework.useraccount.repository.UserAddressRepository;
import com.brijframework.useraccount.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	UserAddressMapper userAddressMapper;
	
	@Autowired
	UserAddressRepository userAddressRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	@Override
	public UserAddressResponse saveAddress(UserAddressRequest userAddressRequest) {
		EOUserAddress eoUserAddress = userAddressMapper.mapRequestToDAO(userAddressRequest);
		eoUserAddress.setAddressDetail(addressRepository.save(eoUserAddress.getAddressDetail()));
		eoUserAddress= userAddressRepository.save(eoUserAddress);
		return userAddressMapper.mapResponseToDTO(eoUserAddress);
	}

	@Override
	public UserAddressResponse getAddress(long id) {
		return userAddressMapper.mapResponseToDTO(userAddressRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteAddress(Long id) {
		EOUserAddress eoUserAddress = userAddressRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserAddress.setActive(true);
		userAddressRepository.save(eoUserAddress);
		return true;
	}

}
