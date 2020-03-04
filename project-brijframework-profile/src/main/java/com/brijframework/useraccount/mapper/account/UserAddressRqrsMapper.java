package com.brijframework.useraccount.mapper.account;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;
import com.brijframework.useraccount.entities.account.EOUserAddress;
import com.brijframework.useraccount.mapper.RQRSMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserAddressRqrsMapper extends RQRSMapper<UserAddressRequest, EOUserAddress, UserAddressResponse>{

	@Mapping(source = "profileId", target = "userProfile.id")
	EOUserAddress mapToDAO(UserAddressRequest userAddressRequest);

	@Mapping(target = "profileId", source = "userProfile.id")
	UserAddressResponse mapToDTO(EOUserAddress eoUserAddress);

}
