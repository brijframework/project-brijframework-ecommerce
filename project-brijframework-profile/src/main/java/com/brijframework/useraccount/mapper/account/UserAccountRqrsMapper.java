package com.brijframework.useraccount.mapper.account;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.useraccount.beans.EOUserLoginDTO;
import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;
import com.brijframework.useraccount.entities.account.EOUserAccount;
import com.brijframework.useraccount.mapper.GenericMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserAccountRqrsMapper extends GenericMapper<EOUserAccount, EOUserLoginDTO>{

	public EOUserAccount getUserAccountRequest(UserAccountRequest loginRequest);
	
	@Mapping(source="userRole.roleName", target="role")
	public UserAccountResponse getUserAccountResponse(EOUserAccount loginRequest);

	public List<UserAccountResponse> getUserAccountResponse(List<EOUserAccount> findAll);
	
}
