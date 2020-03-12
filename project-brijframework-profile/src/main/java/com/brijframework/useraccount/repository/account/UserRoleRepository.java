package com.brijframework.useraccount.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.useraccount.entities.account.EOUserRole;

@Repository
@Transactional
public interface UserRoleRepository  extends JpaRepository<EOUserRole, Long>{

	EOUserRole findByUserAccountIdAndRoleDetailRoleName(Long accountId,String role);
	
	EOUserRole findByUserAccountIdAndRoleDetailPosition(Long accountId,int position);

}
