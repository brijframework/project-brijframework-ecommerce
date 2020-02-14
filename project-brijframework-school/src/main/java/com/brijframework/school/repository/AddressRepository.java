package com.brijframework.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.school.domain.location.Address;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address, Long>{

}
