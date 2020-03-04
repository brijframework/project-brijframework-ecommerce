package com.brijframework.useraccount.service.account;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;

public interface UserAccountService {

	public UserAccountResponse saveUserAccount(UserAccountRequest roleRequest);

	public List<UserAccountResponse> getUserAccountList();

	public UserAccountResponse getUserAccount(Long id);

	public boolean deleteUserAccount(Long id);
}
