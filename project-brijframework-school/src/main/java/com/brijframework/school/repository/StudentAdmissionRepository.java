package com.brijframework.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentAdmission;

@Repository
@Transactional
public interface StudentAdmissionRepository extends JpaRepository<StudentAdmission, Long>  {

	StudentAdmission findByActiveAndId(boolean active,Long id);

	List<StudentAdmission> findByActiveAndSchoolDetailId(boolean active, Long schoolId);

}
