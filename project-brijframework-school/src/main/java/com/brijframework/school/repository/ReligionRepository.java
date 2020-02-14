package com.brijframework.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.comman.Religion;

@Repository
@Transactional
public interface ReligionRepository extends JpaRepository<Religion, Long>{

}
