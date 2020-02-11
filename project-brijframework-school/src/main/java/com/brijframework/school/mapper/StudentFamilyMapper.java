package com.brijframework.school.mapper;

import com.brijframework.school.bean.student.StudentFamilyContactDTO;
import com.brijframework.school.bean.student.StudentFamilyDTO;
import com.brijframework.school.bean.student.StudentFamilyQualificationDTO;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.domain.student.StudentFamily;
import com.brijframework.school.domain.student.StudentFamilyContact;
import com.brijframework.school.domain.student.StudentFamilyQualification;

public interface StudentFamilyMapper {

	StudentFamily toEntity(StudentFamilyDTO studentFamilyDTO);

	StudentFamilyDTO toDTO(StudentFamily studentFamily);

	StudentDetail toStudentDetail(Long studentDetailId);

	StudentFamilyContact getFamilyContact(StudentFamilyContactDTO studentFamilyContactDTO);

	StudentFamilyQualification getFamilyQualification(StudentFamilyQualificationDTO studentFamilyQualificationDTO);

}
