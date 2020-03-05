package com.brijframework.useraccount.repository.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.useraccount.entities.global.EORoleDetail;

@Repository
@Transactional
public interface RoleDetailRepository  extends JpaRepository<EORoleDetail, Long>{

	EORoleDetail findByRoleName(String role);
	
	EORoleDetail findByPosition(int position);

}
