package com.brijframework.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentAdmission;

@Repository
@Transactional
public interface StudentAdmissionRepository extends JpaRepository<StudentAdmission, Long>  {

	StudentAdmission findByActiveAndSchoolDetailIdAndId(boolean b, Long schoolId, Long id);

	List<StudentAdmission> findByActiveAndSchoolDetailId(boolean b, Long schoolId);

}
