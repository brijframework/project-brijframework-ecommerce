package com.brijframework.useraccount.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.useraccount.entities.account.EOUserImgDetail;

@Repository
@Transactional
public interface UserImgDetailRepository extends JpaRepository<EOUserImgDetail, Long>{

}
