package com.brijframework.school.mapper;

import com.brijframework.school.bean.student.StudentFamilyContactDTO;
import com.brijframework.school.bean.student.StudentFamilyDTO;
import com.brijframework.school.bean.student.StudentFamilyQualificationDTO;
import com.brijframework.school.domain.student.StudentFamily;
import com.brijframework.school.domain.student.StudentFamilyContact;
import com.brijframework.school.domain.student.StudentFamilyQualification;
import com.brijframework.school.domain.student.StudentProfile;

public interface StudentFamilyMapper {

	StudentFamily toEntity(StudentFamilyDTO studentFamilyDTO);

	StudentFamilyDTO toDTO(StudentFamily studentFamily);

	StudentProfile toStudentProfile(Long studentDetailId);

	StudentFamilyContact getFamilyContact(StudentFamilyContactDTO studentFamilyContactDTO);

	StudentFamilyQualification getFamilyQualification(StudentFamilyQualificationDTO studentFamilyQualificationDTO);

}
