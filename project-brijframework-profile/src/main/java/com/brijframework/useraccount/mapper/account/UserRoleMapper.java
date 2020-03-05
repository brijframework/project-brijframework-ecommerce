package com.brijframework.useraccount.mapper.account;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.useraccount.beans.EOUserRoleDTO;
import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;
import com.brijframework.useraccount.entities.account.EOUserRole;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserRoleMapper extends RQRSMapper<UserRoleRequest, EOUserRole, EOUserRoleDTO,  UserRoleResponse> {

	@Mapping(target = "userAccount.id", source = "accountId")
	@Mapping(target = "roleDetail.id", source = "roleId")
	@Override
	EOUserRole mapToDAO(UserRoleRequest eoRoleDTO) ;
	
	@Mapping(source = "userAccount.id", target = "accountId")
	@Mapping(source = "roleDetail.id", target = "roleId")
	@Override
	UserRoleResponse mapToDTO(EOUserRole eoRole);
}
