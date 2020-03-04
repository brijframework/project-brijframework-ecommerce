package com.brijframework.useraccount.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.useraccount.entities.account.EOUserProfile;

@Repository
@Transactional
public interface UserProfileRepository extends JpaRepository<EOUserProfile, Long>{

}
