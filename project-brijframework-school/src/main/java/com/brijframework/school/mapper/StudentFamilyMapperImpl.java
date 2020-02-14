package com.brijframework.school.mapper;

import org.springframework.stereotype.Component;

import com.brijframework.school.bean.student.StudentFamilyContactDTO;
import com.brijframework.school.bean.student.StudentFamilyDTO;
import com.brijframework.school.bean.student.StudentFamilyQualificationDTO;
import com.brijframework.school.domain.comman.ContactDetail;
import com.brijframework.school.domain.comman.QualificationDetail;
import com.brijframework.school.domain.student.StudentFamily;
import com.brijframework.school.domain.student.StudentFamilyContact;
import com.brijframework.school.domain.student.StudentFamilyQualification;
import com.brijframework.school.domain.student.StudentProfile;

@Component
public class StudentFamilyMapperImpl implements StudentFamilyMapper {

	@Override
	public StudentFamily toEntity(StudentFamilyDTO studentFamilyDTO) {
		StudentFamily studentFamily=new StudentFamily();
		studentFamily.setId(studentFamilyDTO.getId());
		studentFamily.setActive(true);
		studentFamily.setAnnualIncome(studentFamilyDTO.getAnnualIncome());
		studentFamily.setOccupation(studentFamilyDTO.getOccupation());
		studentFamily.setName(studentFamilyDTO.getName());
		return studentFamily;
	}
	
	@Override
	public StudentFamilyDTO toDTO(StudentFamily studentFamily) {
		StudentFamilyDTO studentFamilyDTO=new StudentFamilyDTO();
		studentFamilyDTO.setId(studentFamily.getId());
		studentFamilyDTO.setAnnualIncome(studentFamily.getAnnualIncome());
		studentFamilyDTO.setOccupation(studentFamily.getOccupation());
		studentFamilyDTO.setName(studentFamily.getName());
		return studentFamilyDTO;
	}

	@Override
	public StudentProfile toStudentProfile(Long studentDetailId) {
		StudentProfile studentDetail=new StudentProfile();
		studentDetail.setId(studentDetailId);
		return studentDetail;
	}
	
	@Override
	public StudentFamilyContact getFamilyContact(StudentFamilyContactDTO studentFamilyContactDTO) {
		StudentFamilyContact familyContact=new StudentFamilyContact();
		familyContact.setId(studentFamilyContactDTO.getId());
		familyContact.setActive(true);
		familyContact.setContactDetail(getContactDetail(studentFamilyContactDTO.getType(), studentFamilyContactDTO.getValue()));
		return familyContact;
	}

	private ContactDetail getContactDetail(String type, String value) {
		ContactDetail contactDetail=new ContactDetail();
		contactDetail.setActive(true);
		contactDetail.setType(type);
		contactDetail.setValue(value);
		return contactDetail;
	}

	@Override
	public StudentFamilyQualification getFamilyQualification(StudentFamilyQualificationDTO studentFamilyQualificationDTO) {
		StudentFamilyQualification familyQualification=new StudentFamilyQualification();
		familyQualification.setQualificationDetail(new QualificationDetail(studentFamilyQualificationDTO.getQualificationDetailId()));
		return familyQualification;
	}
}
