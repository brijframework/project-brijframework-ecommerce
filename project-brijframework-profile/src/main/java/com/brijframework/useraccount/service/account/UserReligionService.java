package com.brijframework.useraccount.service.account;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.UserReligionRequest;
import com.brijframework.useraccount.beans.rqrs.UserReligionResponse;

public interface UserReligionService {

	UserReligionResponse saveUserReligion(UserReligionRequest userAccountRequest);

	List<UserReligionResponse> getUserReligionList();

	UserReligionResponse getUserReligion(Long id);

	boolean deleteUserReligion(Long id);

}
