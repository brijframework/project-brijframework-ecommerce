package com.brijframework.school.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentFamily;

@Repository
@Transactional
public interface StudentFamilyRepository extends JpaRepository<StudentFamily, Long> {

	Optional<List<StudentFamily>> findByStudentProfileId(Long studentDetailId);

}
