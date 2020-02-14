package com.brijframework.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentRegistration;

@Repository
@Transactional
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Long> {

	StudentRegistration findByActiveAndId(boolean active,Long id);

	List<StudentRegistration> findByActiveAndSchoolDetailId(boolean active,Long schoolId);
}
