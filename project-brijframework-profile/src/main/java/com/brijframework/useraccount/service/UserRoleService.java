package com.brijframework.useraccount.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;

public interface UserRoleService {

	public UserRoleResponse saveRole(UserRoleRequest roleRequest);
	
	public List<UserRoleResponse> getRoleList();
	
	public UserRoleResponse getRole(Long id) ;
	
	public boolean deleteRole(@PathVariable Long id);
}
