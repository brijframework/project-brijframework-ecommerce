package com.brijframework.school.mapper;

import com.brijframework.school.bean.location.AddressRequest;
import com.brijframework.school.bean.student.StudentAdmissionDTO;
import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;
import com.brijframework.school.bean.student.StudentProfileDTO;
import com.brijframework.school.bean.student.StudentRegistrationDTO;
import com.brijframework.school.domain.comman.Religion;
import com.brijframework.school.domain.location.Address;
import com.brijframework.school.domain.setting.SchoolDetail;
import com.brijframework.school.domain.student.StudentAdmission;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.domain.student.StudentProfile;
import com.brijframework.school.domain.student.StudentRegistration;

public interface StudentDetailMapper {

	StudentDetail toEntity(StudentDetailRequest detailRequest);

	StudentDetailDTO toDTO(StudentDetail studentDetail);

	StudentRegistration toEntity(StudentRegistrationDTO student);

	StudentRegistrationDTO toDTO(StudentRegistration student);

	SchoolDetail getSchoolDetail(Long schoolDetailId);

	StudentAdmissionDTO toDTO(StudentAdmission studentAdmission);

	StudentAdmission toEntity(StudentAdmissionDTO studentDTO);

	StudentDetail getStudentDetail(Long studentDetailId);

	StudentProfile getStudentProfile(Long studentDetailId);

	StudentProfile getStudentProfile(StudentProfileDTO studentProfileDTO);

	Address getAddress(AddressRequest address);

	Religion getReligion(Long religionId);

	AddressRequest getAddress(Address address);
	
}
