package com.brijframework.useraccount.mapper.account;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.rqrs.UserReligionRequest;
import com.brijframework.useraccount.beans.rqrs.UserReligionResponse;
import com.brijframework.useraccount.entities.account.EOUserReligion;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserReligionMapper extends RQRSMapper<UserReligionRequest, EOUserReligion, UserReligionResponse> {

}
