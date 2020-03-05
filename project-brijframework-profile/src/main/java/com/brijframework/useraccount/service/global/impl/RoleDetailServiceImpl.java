package com.brijframework.useraccount.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.RoleDetailRequest;
import com.brijframework.useraccount.beans.rqrs.RoleDetailResponse;
import com.brijframework.useraccount.entities.global.EORoleDetail;
import com.brijframework.useraccount.mapper.global.RoleDetailMapper;
import com.brijframework.useraccount.repository.global.RoleDetailRepository;
import com.brijframework.useraccount.service.global.RoleDetailService;

@Service
public class RoleDetailServiceImpl implements RoleDetailService{

	@Autowired
	private RoleDetailMapper roleDetailMapper;
	
	@Autowired
	private RoleDetailRepository roleDetailRepository;
	
	@Override
	public RoleDetailResponse saveRoleDetail(RoleDetailRequest RoleDetailRequest) {
		EORoleDetail eoRoleDetail = roleDetailMapper.mapToDAO(RoleDetailRequest);
		eoRoleDetail.setActive(true);
		eoRoleDetail= roleDetailRepository.save(eoRoleDetail);
		return roleDetailMapper.mapToDTO(eoRoleDetail);
	}

	@Override
	public RoleDetailResponse getRoleDetail(long id) {
		return roleDetailMapper.mapToDTO(roleDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteRoleDetail(Long id) {
		EORoleDetail eoRoleDetail = roleDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoRoleDetail.setActive(false);
		roleDetailRepository.save(eoRoleDetail);
		return true;
	}
	
	@Override
	public List<RoleDetailResponse> getRoleDetailList() {
		return roleDetailMapper.mapToDTO(roleDetailRepository.findAll());
	}
}
