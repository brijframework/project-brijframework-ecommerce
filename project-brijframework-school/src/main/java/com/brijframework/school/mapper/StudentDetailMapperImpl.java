package com.brijframework.school.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brijframework.school.bean.location.AddressDTO;
import com.brijframework.school.bean.location.AddressRequest;
import com.brijframework.school.bean.student.StudentAdmissionDTO;
import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;
import com.brijframework.school.bean.student.StudentProfileDTO;
import com.brijframework.school.bean.student.StudentRegistrationDTO;
import com.brijframework.school.domain.comman.Religion;
import com.brijframework.school.domain.location.Address;
import com.brijframework.school.domain.location.City;
import com.brijframework.school.domain.setting.SchoolDetail;
import com.brijframework.school.domain.student.StudentAdmission;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.domain.student.StudentProfile;
import com.brijframework.school.domain.student.StudentRegistration;
import com.brijframework.school.util.ApplicationUtil;

@Component
public class StudentDetailMapperImpl implements StudentDetailMapper {

	@Autowired
	ApplicationUtil applicationUtil;
	
	@Override
	public StudentDetail toEntity(StudentDetailRequest detailRequest) {
		StudentDetail detail=new StudentDetail();
		detail.setActive(true);
		detail.setId(detailRequest.getId());
		detail.setStudentProfile(studentProfile(detailRequest));
		return detail;
	}

	private StudentProfile studentProfile(StudentDetailRequest detailRequest) {
		StudentProfile studentProfile=new StudentProfile();
		studentProfile.setFirstName(detailRequest.getFirstName());
		studentProfile.setMiddleName(detailRequest.getMiddleName());
		studentProfile.setLastName(detailRequest.getLastName());
		studentProfile.setDateOfBirth(applicationUtil.toDate(detailRequest.getDateOfBirth()));
		return studentProfile;
	}

	@Override
	public SchoolDetail getSchoolDetail(Long schoolDetailId) {
		SchoolDetail detail=new SchoolDetail();
		detail.setId(schoolDetailId);
		return detail;
	}
	
	@Override
	public StudentProfile getStudentProfile(Long schoolDetailId) {
		StudentProfile detail=new StudentProfile();
		detail.setId(schoolDetailId);
		return detail;
	}
	
	@Override
	public StudentDetail getStudentDetail(Long studentDetailId) {
		StudentDetail studentDetail=new StudentDetail();
		studentDetail.setId(studentDetailId);
		return studentDetail;
	}

	@Override
	public StudentDetailDTO toDTO(StudentDetail detailRequest) {
		StudentDetailDTO detail=new StudentDetailDTO();
		detail.setId(detailRequest.getId());
		detail.setFirstName(detailRequest.getStudentProfile().getFirstName());
		detail.setMiddleName(detailRequest.getStudentProfile().getMiddleName());
		detail.setLastName(detailRequest.getStudentProfile().getLastName());
		detail.setDateOfBirth(applicationUtil.toString(detailRequest.getStudentProfile().getDateOfBirth()));
		return detail;
	}

	@Override
	public StudentRegistration toEntity(StudentRegistrationDTO studentDTO) {
		StudentRegistration student=new StudentRegistration();
		student.setId(studentDTO.getId());
		student.setActive(true);
		return student;
	}
	
	@Override
	public StudentProfile getStudentProfile(StudentProfileDTO studentProfileDTO) {
		StudentProfile detail=new StudentProfile();
		detail.setActive(true);
		detail.setId(studentProfileDTO.getId());
		detail.setFirstName(studentProfileDTO.getFirstName());
		detail.setMiddleName(studentProfileDTO.getMiddleName());
		detail.setLastName(studentProfileDTO.getLastName());
		detail.setDateOfBirth(applicationUtil.toDate(studentProfileDTO.getDateOfBirth()));
		detail.setMotherTounge(studentProfileDTO.getMotherTounge());
		detail.setNationality(studentProfileDTO.getNationality());
		detail.setPhysicallyChallenged(studentProfileDTO.getPhysicallyChallenged());
		detail.setGender(studentProfileDTO.getGender());
		return detail;
	}


	@Override
	public StudentRegistrationDTO toDTO(StudentRegistration studentDTO) {
		StudentRegistrationDTO student=new StudentRegistrationDTO();
		student.setId(studentDTO.getId());
		student.setSchoolDetailId(studentDTO.getSchoolDetail().getId());
		if(studentDTO.getStudentProfile()!=null) {
			student.setStudentProfile(getStudentProfile(studentDTO.getStudentProfile()));
		}
		return student;
	}

	private StudentProfileDTO getStudentProfile(StudentProfile studentProfileDTO) {
		StudentProfileDTO detail=new StudentProfileDTO();
		detail.setId(studentProfileDTO.getId());
		detail.setFirstName(studentProfileDTO.getFirstName());
		detail.setMiddleName(studentProfileDTO.getMiddleName());
		detail.setLastName(studentProfileDTO.getLastName());
		detail.setDateOfBirth(applicationUtil.toString(studentProfileDTO.getDateOfBirth()));
		detail.setMotherTounge(studentProfileDTO.getMotherTounge());
		detail.setNationality(studentProfileDTO.getNationality());
		detail.setPhysicallyChallenged(studentProfileDTO.getPhysicallyChallenged());
		detail.setGender(studentProfileDTO.getGender());
		detail.setAddress(getAddress(studentProfileDTO.getAddress()));
		return detail;
	}

	@Override
	public StudentAdmissionDTO toDTO(StudentAdmission studentAdmission) {
		StudentAdmissionDTO admissionDTO=new StudentAdmissionDTO();
		admissionDTO.setId(studentAdmission.getId());
		admissionDTO.setAdmissionDate(applicationUtil.toString(studentAdmission.getAdmissionDate()));
		admissionDTO.setStatus(studentAdmission.getAdmissionStatus().getName());
		admissionDTO.setWrittenOrIntervieDate(applicationUtil.toString(studentAdmission.getWrittenOrIntervieDate()));
		return admissionDTO;
	}

	@Override
	public StudentAdmission toEntity(StudentAdmissionDTO studentAdmission) {
		StudentAdmission admissionDTO=new StudentAdmission();
		admissionDTO.setId(studentAdmission.getId());
		admissionDTO.setAdmissionDate(applicationUtil.toDate(studentAdmission.getAdmissionDate()));
		admissionDTO.setWrittenOrIntervieDate(applicationUtil.toDate(studentAdmission.getWrittenOrIntervieDate()));
		return admissionDTO;
	}

	@Override
	public Address getAddress(AddressRequest addressRequest) {
		Address address=new Address();
		address.setActive(true);
		address.setId(addressRequest.getId());
		address.setAddressLine1(addressRequest.getAddressLine1());
		address.setAddressLine2(addressRequest.getAddressLine2());
		address.setLandMark(addressRequest.getLandMark());
		address.setZipcode(addressRequest.getZipcode());
		address.setCity(new City(addressRequest.getCityId()));
		return address;
	}

	@Override
	public AddressRequest getAddress(Address addressRequest) {
		AddressRequest address=new AddressRequest();
		address.setId(addressRequest.getId());
		address.setAddressLine1(addressRequest.getAddressLine1());
		address.setAddressLine2(addressRequest.getAddressLine2());
		address.setLandMark(addressRequest.getLandMark());
		address.setZipcode(addressRequest.getZipcode());
		address.setCityId(addressRequest.getCity().getId());
		return address;
	}
	
	@Override
	public Religion getReligion(Long religionId) {
		Religion religion=new Religion();
		religion.setId(religionId);
		return religion;
	}
	
}
