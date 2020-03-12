package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserImgDetailRequest;
import com.brijframework.useraccount.beans.rqrs.UserImgDetailResponse;
import com.brijframework.useraccount.entities.account.EOUserImgDetail;
import com.brijframework.useraccount.mapper.account.UserImgDetailMapper;
import com.brijframework.useraccount.repository.account.UserImgDetailRepository;
import com.brijframework.useraccount.repository.global.DocumentDetailRepository;
import com.brijframework.useraccount.service.account.UserImgDetailService;

@Service
public class UserImgDetailServiceImpl implements UserImgDetailService{

	@Autowired
	private UserImgDetailMapper userImgDetailMapper;
	
	@Autowired
	private UserImgDetailRepository userImgDetailRepository;
	
	@Autowired
	private DocumentDetailRepository imgDetailRepository;
	
	@Override
	public UserImgDetailResponse saveUserImgDetail(UserImgDetailRequest userImgDetailRequest) {
		EOUserImgDetail eoUserImgDetail = userImgDetailMapper.mapRequestToDAO(userImgDetailRequest);
		eoUserImgDetail.setActive(true);
		eoUserImgDetail.setImgDetail(imgDetailRepository.save(eoUserImgDetail.getImgDetail()));
		eoUserImgDetail= userImgDetailRepository.save(eoUserImgDetail);
		return userImgDetailMapper.mapResponseToDTO(eoUserImgDetail);
	}

	@Override
	public UserImgDetailResponse getUserImgDetail(long id) {
		return userImgDetailMapper.mapResponseToDTO(userImgDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteUserImgDetail(Long id) {
		EOUserImgDetail eoUserImgDetail = userImgDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserImgDetail.setActive(true);
		userImgDetailRepository.save(eoUserImgDetail);
		return true;
	}
	
	@Override
	public List<UserImgDetailResponse> getUserImgDetailList() {
		return userImgDetailMapper.mapResponseToDTO(userImgDetailRepository.findAll());
	}
}
