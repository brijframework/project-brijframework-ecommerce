package com.brijframework.school.mapper;

import com.brijframework.school.bean.student.StudentInformationDTO;
import com.brijframework.school.bean.student.StudentAdmissionDTO;
import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;
import com.brijframework.school.domain.student.StudentInformation;
import com.brijframework.school.domain.setting.SchoolDetail;
import com.brijframework.school.domain.student.StudentAdmission;
import com.brijframework.school.domain.student.StudentDetail;

public interface StudentDetailMapper {

	StudentDetail toEntity(StudentDetailRequest detailRequest);

	StudentDetailDTO toDTO(StudentDetail studentDetail);

	StudentInformation toEntity(StudentInformationDTO student);

	StudentInformationDTO toDTO(StudentInformation student);

	SchoolDetail getSchoolDetail(Long schoolDetailId);

	StudentAdmissionDTO toDTO(StudentAdmission studentAdmission);

	StudentAdmission toEntity(StudentAdmissionDTO studentDTO);

	StudentDetail getStudentDetail(Long studentDetailId);
	
}
