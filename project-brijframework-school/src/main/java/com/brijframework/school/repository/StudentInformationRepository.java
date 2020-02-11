package com.brijframework.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentInformation;

@Repository
@Transactional
public interface StudentInformationRepository extends JpaRepository<StudentInformation, Long> {

	StudentInformation findByActiveAndId(boolean active,Long id);

	List<StudentInformation> findByActiveAndSchoolDetailId(boolean active,Long schoolId);
}
