package com.brijframework.school.mapper;

import com.brijframework.school.bean.school.SchoolDetailDTO;
import com.brijframework.school.bean.school.SchoolDetailRequest;
import com.brijframework.school.domain.setting.SchoolDetail;

public interface SchoolDetailMapper {

	SchoolDetail toEntity(SchoolDetailRequest student);

	SchoolDetailDTO toDTO(SchoolDetail schoolDetail);

}
