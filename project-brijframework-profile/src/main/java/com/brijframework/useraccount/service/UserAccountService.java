package com.brijframework.useraccount.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;

public interface UserAccountService {

	public UserAccountResponse saveAccount(UserAccountRequest roleRequest);

	public List<UserAccountResponse> getAccountList();

	public UserAccountResponse getAccount(Long id);

	public boolean deleteAccount(@PathVariable Long id);
}
