package com.brijframework.school.service.student;

import com.brijframework.school.bean.student.StudentProfileDTO;
import com.brijframework.school.domain.student.StudentProfile;

public interface StudentProfileService {

	StudentProfile saveStudentProfile(StudentProfileDTO studentProfile);

}
