package com.brijframework.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentDocument;

@Repository
@Transactional
public interface StudentDocumentRepository extends JpaRepository<StudentDocument, Long>  {

	List<StudentDocument> findByStudentProfileId(Long studentDetailId);

	StudentDocument findByStudentProfileIdAndId(Long studentDetailId, Long id);

}
