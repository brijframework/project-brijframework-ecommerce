package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;

public interface StudentDetailService {

	StudentDetailDTO saveStudentDetail(Long schoolId,StudentDetailRequest student);

	boolean deleteStudentDetail(Long schoolId,Long id);

	StudentDetailDTO getStudentDetail(Long schoolId,Long id);

	List<StudentDetailDTO> getStudentDetailList(Long schoolId);

}
