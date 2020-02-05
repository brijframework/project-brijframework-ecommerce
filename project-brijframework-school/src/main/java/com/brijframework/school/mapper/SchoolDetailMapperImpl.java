package com.brijframework.school.mapper;

import org.springframework.stereotype.Component;

import com.brijframework.school.bean.school.SchoolDetailDTO;
import com.brijframework.school.bean.school.SchoolDetailRequest;
import com.brijframework.school.domain.setting.SchoolDetail;

@Component
public class SchoolDetailMapperImpl implements SchoolDetailMapper {

	@Override
	public SchoolDetail toEntity(SchoolDetailRequest student) {
		SchoolDetail detail=new SchoolDetail();
		detail.setId(student.getId());
		detail.setLogoUrl(student.getLogoUrl());
		detail.setName(student.getName());
		detail.setActive(true);
		return detail;
	}
	
	@Override
	public SchoolDetailDTO toDTO(SchoolDetail schoolDetail) {
		SchoolDetailDTO detail=new SchoolDetailDTO();
		detail.setId(schoolDetail.getId());
		detail.setLogoUrl(schoolDetail.getLogoUrl());
		detail.setName(schoolDetail.getName());
		return detail;
	}
}
