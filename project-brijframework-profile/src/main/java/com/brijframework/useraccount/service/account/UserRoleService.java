package com.brijframework.useraccount.service.account;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;

public interface UserRoleService {

	public UserRoleResponse saveUserRole(UserRoleRequest roleRequest);
	
	public List<UserRoleResponse> getUserRoleList();
	
	public UserRoleResponse getUserRole(Long id) ;
	
	public boolean deleteUserRole(Long id);
}
