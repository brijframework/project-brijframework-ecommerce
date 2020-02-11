package com.brijframework.school.mapper;

import com.brijframework.school.bean.student.StudentContactDTO;
import com.brijframework.school.domain.comman.ContactDetail;
import com.brijframework.school.domain.student.StudentContact;
import com.brijframework.school.domain.student.StudentDetail;

public interface StudentContactMapper {

	StudentContact toEntity(StudentContactDTO studentContactDTO);

	ContactDetail toEntity(String type, String value);

	StudentDetail toEntity(Long studentDetailId);

	StudentContactDTO toDTO(StudentContact studentContact);

}
