package com.brijframework.useraccount.repository.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.useraccount.entities.global.EOCasteDetail;


@Repository
@Transactional
public interface CasteDetailRepository extends JpaRepository<EOCasteDetail, Long>{

}
