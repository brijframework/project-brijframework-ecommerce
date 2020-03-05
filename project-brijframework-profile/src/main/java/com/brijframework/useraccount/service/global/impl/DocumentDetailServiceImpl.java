package com.brijframework.useraccount.service.global.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.DocumentDetailRequest;
import com.brijframework.useraccount.beans.rqrs.DocumentDetailResponse;
import com.brijframework.useraccount.entities.global.EODocumentDetail;
import com.brijframework.useraccount.mapper.global.DocumentDetailMapper;
import com.brijframework.useraccount.repository.global.DocumentDetailRepository;
import com.brijframework.useraccount.service.global.DocumentDetailService;

@Service
public class DocumentDetailServiceImpl implements DocumentDetailService{

	@Autowired
	private DocumentDetailMapper imgDetailMapper;
	
	@Autowired
	private DocumentDetailRepository imgDetailRepository;
	
	@Override
	public DocumentDetailResponse saveDocumentDetail(DocumentDetailRequest documentDetailRequest) {
		EODocumentDetail eoDocumentDetail = imgDetailMapper.mapToDAO(documentDetailRequest);
		eoDocumentDetail.setActive(true);
		eoDocumentDetail= imgDetailRepository.save(eoDocumentDetail);
		return imgDetailMapper.mapToDTO(eoDocumentDetail);
	}

	@Override
	public DocumentDetailResponse getDocumentDetail(long id) {
		return imgDetailMapper.mapToDTO(imgDetailRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteDocumentDetail(Long id) {
		EODocumentDetail eoDocumentDetail = imgDetailRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoDocumentDetail.setActive(false);
		imgDetailRepository.save(eoDocumentDetail);
		return true;
	}
	
	@Override
	public List<DocumentDetailResponse> getDocumentDetailList() {
		return imgDetailMapper.mapToDTO(imgDetailRepository.findAll());
	}
}
