package com.brijframework.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.comman.QualificationDetailDTO;
import com.brijframework.school.domain.comman.QualificationDetail;
import com.brijframework.school.mapper.QualificationDetailMapper;
import com.brijframework.school.repository.QualificationDetailRepository;

@Service
public class QualificationDetailServiceImpl implements QualificationDetailService {

	@Autowired
	private QualificationDetailMapper qualificationDetailMapper;
	
	@Autowired
	private QualificationDetailRepository qualificationDetailRepository;
	
	@Override
	public QualificationDetailDTO saveQualification(QualificationDetailDTO qualificationDetailDTO) {
		QualificationDetail qualificationDetail=qualificationDetailMapper.toEntity(qualificationDetailDTO);
		qualificationDetail=qualificationDetailRepository.save(qualificationDetail);
		return qualificationDetailMapper.toDTO(qualificationDetail);
	}

}
