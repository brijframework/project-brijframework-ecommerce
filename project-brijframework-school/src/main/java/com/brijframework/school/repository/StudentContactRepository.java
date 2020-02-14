package com.brijframework.school.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentContact;

@Repository
@Transactional
public interface StudentContactRepository extends JpaRepository<StudentContact, Long> {

	Optional<List<StudentContact>> findByStudentProfileId(Long studentDetailId);

	StudentContact findByStudentProfileIdAndId(Long studentDetailId, Long id);

}
