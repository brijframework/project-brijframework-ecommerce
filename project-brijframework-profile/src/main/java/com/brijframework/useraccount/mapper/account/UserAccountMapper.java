package com.brijframework.useraccount.mapper.account;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOUserAccountDTO;
import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;
import com.brijframework.useraccount.entities.account.EOUserAccount;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserAccountMapper  extends RQRSMapper<UserAccountRequest, EOUserAccount, EOUserAccountDTO, UserAccountResponse>{
	
}
