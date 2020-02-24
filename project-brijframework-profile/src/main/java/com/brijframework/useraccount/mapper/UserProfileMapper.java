package com.brijframework.useraccount.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.brijframework.useraccount.beans.EOUserProfileDTO;
import com.brijframework.useraccount.beans.rqrs.UserProfileRequest;
import com.brijframework.useraccount.beans.rqrs.UserProfileResponse;
import com.brijframework.useraccount.entities.account.EOUserProfile;

@Mapper(componentModel = "spring", implementationPackage = "com.brijframework.useraccount.mapper.impl")
public interface UserProfileMapper  extends GenericMapper<EOUserProfile, EOUserProfileDTO>{

	EOUserProfile mapRequestToDAO(UserProfileRequest userProfileRequest);

	UserProfileResponse mapToDTOResponse(EOUserProfile eoUserProfile);

	List<UserProfileResponse> mapToDTOResponse(List<EOUserProfile> findAll);

}
