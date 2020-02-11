package com.brijframework.school.mapper;

import org.springframework.stereotype.Component;

import com.brijframework.school.bean.student.StudentContactDTO;
import com.brijframework.school.domain.comman.ContactDetail;
import com.brijframework.school.domain.student.StudentContact;
import com.brijframework.school.domain.student.StudentDetail;

@Component
public class StudentContactMapperImpl implements StudentContactMapper {
	
	@Override
	public StudentContact toEntity(StudentContactDTO studentContactDTO) {
		StudentContact studentContact = new StudentContact();
		studentContact.setActive(true);
		studentContact.setContactDetail(toEntity(studentContactDTO.getType(), studentContactDTO.getValue()));
		studentContact.setStudentDetail(toEntity(studentContactDTO.getStudentDetailId()));
		return studentContact;
	}

	@Override
	public StudentDetail toEntity(Long studentDetailId) {
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setId(studentDetailId);
		return studentDetail;
	}

	@Override
	public ContactDetail toEntity(String type, String value) {
		ContactDetail contactDetail = new ContactDetail();
		contactDetail.setActive(true);
		contactDetail.setType(type);
		contactDetail.setValue(value);
		return contactDetail;
	}
	
	@Override
	public StudentContactDTO toDTO(StudentContact studentContact) {
		StudentContactDTO studentContactDTO=new StudentContactDTO();
		studentContactDTO.setId(studentContact.getId());
		studentContactDTO.setType(studentContact.getContactDetail().getType());
		studentContactDTO.setValue(studentContact.getContactDetail().getValue());
		studentContactDTO.setStudentDetailId(studentContact.getStudentDetail().getId());
		return studentContactDTO;
	}
}
