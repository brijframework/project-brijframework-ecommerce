package com.brijframework.school.mapper;

import com.brijframework.school.bean.comman.QualificationDetailDTO;
import com.brijframework.school.domain.comman.QualificationDetail;

public interface QualificationDetailMapper {

	QualificationDetail toEntity(QualificationDetailDTO qualificationDetailDTO);

	QualificationDetailDTO toDTO(QualificationDetail qualificationDetail);

}
