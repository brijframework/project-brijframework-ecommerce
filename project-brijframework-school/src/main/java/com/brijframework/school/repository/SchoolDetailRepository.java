package com.brijframework.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.setting.SchoolDetail;


@Repository
@Transactional
public interface SchoolDetailRepository extends JpaRepository<SchoolDetail, Long>  {

}
