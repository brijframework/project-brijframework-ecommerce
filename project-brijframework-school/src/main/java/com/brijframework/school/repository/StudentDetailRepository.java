package com.brijframework.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.student.StudentDetail;

@Repository
@Transactional
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Long> {

	StudentDetail findByActiveAndSchoolDetailIdAndId(boolean active,Long schoolId, Long id);

	List<StudentDetail> findByActiveAndSchoolDetailId(boolean active,Long schoolId);

}
