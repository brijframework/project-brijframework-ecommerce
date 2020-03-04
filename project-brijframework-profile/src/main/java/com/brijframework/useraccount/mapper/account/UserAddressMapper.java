package com.brijframework.useraccount.mapper.account;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.useraccount.beans.EOUserAddressDTO;
import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;
import com.brijframework.useraccount.entities.account.EOUserAddress;
import com.brijframework.useraccount.mapper.GenericMapper;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserAddressMapper extends GenericMapper<EOUserAddress, EOUserAddressDTO>{

	@Mapping(source = "profileId", target = "userProfile.id")
	EOUserAddress mapRequestToDAO(UserAddressRequest userAddressRequest);

	@Mapping(target = "profileId", source = "userProfile.id")
	UserAddressResponse mapResponseToDTO(EOUserAddress eoUserAddress);

}
