package com.brijframework.school.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brijframework.school.bean.student.StudentInformationDTO;
import com.brijframework.school.bean.student.StudentAdmissionDTO;
import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;
import com.brijframework.school.domain.setting.SchoolDetail;
import com.brijframework.school.domain.student.StudentInformation;
import com.brijframework.school.domain.student.StudentAdmission;
import com.brijframework.school.domain.student.StudentDetail;
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
		detail.setFirstName(detailRequest.getFirstName());
		detail.setMiddleName(detailRequest.getMiddleName());
		detail.setLastName(detailRequest.getLastName());
		detail.setDateOfBirth(applicationUtil.toDate(detailRequest.getDateOfBirth()));
		return detail;
	}

	@Override
	public SchoolDetail getSchoolDetail(Long schoolDetailId) {
		SchoolDetail detail=new SchoolDetail();
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
		detail.setFirstName(detailRequest.getFirstName());
		detail.setMiddleName(detailRequest.getMiddleName());
		detail.setLastName(detailRequest.getLastName());
		detail.setDateOfBirth(applicationUtil.toString(detailRequest.getDateOfBirth()));
		return detail;
	}

	@Override
	public StudentInformation toEntity(StudentInformationDTO studentDTO) {
		StudentInformation  student=new StudentInformation();
		student.setId(studentDTO.getId());
		student.setActive(true);
		student.setLfNo(studentDTO.getLfNo());
		student.setRollNo(studentDTO.getRollNo());
		student.setSrno(studentDTO.getSrno());
		return student;
	}

	@Override
	public StudentInformationDTO toDTO(StudentInformation studentDTO) {
		StudentInformationDTO  student=new StudentInformationDTO();
		student.setId(studentDTO.getId());
		student.setLfNo(studentDTO.getLfNo());
		student.setRollNo(studentDTO.getRollNo());
		student.setSrno(studentDTO.getSrno());
		return student;
	}

	@Override
	public StudentAdmissionDTO toDTO(StudentAdmission studentAdmission) {
		StudentAdmissionDTO admissionDTO=new StudentAdmissionDTO();
		admissionDTO.setId(studentAdmission.getId());
		admissionDTO.setAdmissionDate(applicationUtil.toString(studentAdmission.getAdmissionDate()));
		admissionDTO.setRegNo(studentAdmission.getRegNo());
		admissionDTO.setsNo(studentAdmission.getsNo());
		admissionDTO.setStatus(studentAdmission.getAdmissionStatus().getName());
		admissionDTO.setWrittenOrIntervieDate(applicationUtil.toString(studentAdmission.getWrittenOrIntervieDate()));
		return admissionDTO;
	}

	@Override
	public StudentAdmission toEntity(StudentAdmissionDTO studentAdmission) {
		StudentAdmission admissionDTO=new StudentAdmission();
		admissionDTO.setId(studentAdmission.getId());
		admissionDTO.setAdmissionDate(applicationUtil.toDate(studentAdmission.getAdmissionDate()));
		admissionDTO.setRegNo(studentAdmission.getRegNo());
		admissionDTO.setsNo(studentAdmission.getsNo());
		admissionDTO.setWrittenOrIntervieDate(applicationUtil.toDate(studentAdmission.getWrittenOrIntervieDate()));
		return admissionDTO;
	}
}
