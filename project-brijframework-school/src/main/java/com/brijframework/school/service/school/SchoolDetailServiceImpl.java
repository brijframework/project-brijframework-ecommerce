package com.brijframework.school.service.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.school.bean.school.SchoolDetailDTO;
import com.brijframework.school.bean.school.SchoolDetailRequest;
import com.brijframework.school.domain.setting.SchoolDetail;
import com.brijframework.school.mapper.SchoolDetailMapper;
import com.brijframework.school.repository.SchoolDetailRepository;

@Service
public class SchoolDetailServiceImpl implements SchoolDetailService {

	@Autowired
	private SchoolDetailMapper schoolDetailMapper;
	
	@Autowired
	private SchoolDetailRepository schoolDetailRepository;
	
	@Override
	public SchoolDetailDTO saveSchool(SchoolDetailRequest student) {
		SchoolDetail schoolDetail = schoolDetailMapper.toEntity(student);
		schoolDetail= schoolDetailRepository.save(schoolDetail);
		return schoolDetailMapper.toDTO(schoolDetail);
	}

}
