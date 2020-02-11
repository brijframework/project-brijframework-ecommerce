package com.brijframework.school.mapper;

import org.springframework.stereotype.Component;

import com.brijframework.school.bean.comman.QualificationDetailDTO;
import com.brijframework.school.domain.comman.QualificationDetail;

@Component
public class QualificationDetailMapperImpl implements QualificationDetailMapper {

	@Override
	public QualificationDetail toEntity(QualificationDetailDTO qualificationDetailDTO) {
		QualificationDetail qualificationDetail=new QualificationDetail();
		qualificationDetail.setId(qualificationDetailDTO.getId());
		qualificationDetail.setActive(true);
		qualificationDetail.setType(qualificationDetailDTO.getType());
		qualificationDetail.setValue(qualificationDetailDTO.getValue());
		return qualificationDetail;
	}
	
	@Override
	public QualificationDetailDTO toDTO(QualificationDetail qualificationDetail) {
		QualificationDetailDTO qualificationDetailDTO=new QualificationDetailDTO();
		qualificationDetailDTO.setId(qualificationDetail.getId());
		qualificationDetailDTO.setType(qualificationDetail.getType());
		qualificationDetailDTO.setValue(qualificationDetail.getValue());
		return qualificationDetailDTO;
	}
}
