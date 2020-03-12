package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserDocumentRequest;
import com.brijframework.useraccount.beans.rqrs.UserDocumentResponse;
import com.brijframework.useraccount.entities.account.EOUserDocument;
import com.brijframework.useraccount.mapper.account.UserDocumentMapper;
import com.brijframework.useraccount.repository.account.UserDocumentRepository;
import com.brijframework.useraccount.repository.global.DocumentDetailRepository;
import com.brijframework.useraccount.service.account.UserDocumentService;

@Service
public class UserDocumentServiceImpl implements UserDocumentService{

	@Autowired
	private UserDocumentMapper userDocumentMapper;
	
	@Autowired
	private UserDocumentRepository userDocumentDetailRepository;
	
	@Autowired
	private DocumentDetailRepository documentDetailRepository;
	
	@Override
	public UserDocumentResponse saveUserDocument(UserDocumentRequest userDocumentDetailRequest) {
		EOUserDocument eoUserDocumentDetail = userDocumentMapper.mapToDAO(userDocumentDetailRequest);
		eoUserDocumentDetail.setActive(true);
		eoUserDocumentDetail.setDocumentDetail(documentDetailRepository.save(eoUserDocumentDetail.getDocumentDetail()));
		eoUserDocumentDetail= userDocumentDetailRepository.save(eoUserDocumentDetail);
		return userDocumentMapper.mapToDTO(eoUserDocumentDetail);
	}

	@Override
	public UserDocumentResponse getUserDocument(Long id) {
		return userDocumentMapper.mapToDTO(userDocumentDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteUserDocument(Long id) {
		EOUserDocument eoUserDocumentDetail = userDocumentDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserDocumentDetail.setActive(true);
		userDocumentDetailRepository.save(eoUserDocumentDetail);
		return true;
	}
	
	@Override
	public List<UserDocumentResponse> getUserDocumentList() {
		return userDocumentMapper.mapToDTO(userDocumentDetailRepository.findAll());
	}

}
