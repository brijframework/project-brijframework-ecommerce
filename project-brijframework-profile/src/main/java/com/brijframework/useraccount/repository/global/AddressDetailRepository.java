package com.brijframework.useraccount.repository.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.useraccount.entities.global.EOAddressDetail;

@Repository
@Transactional
public interface AddressDetailRepository extends JpaRepository<EOAddressDetail, Long>{

}
