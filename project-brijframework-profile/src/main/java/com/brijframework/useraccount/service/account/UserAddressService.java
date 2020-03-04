package com.brijframework.useraccount.service.account;

import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;

public interface UserAddressService {

	UserAddressResponse saveUserAddress(UserAddressRequest userAddressRequest);

	UserAddressResponse getUserAddress(long id);

	boolean deleteUserAddress(Long id);

}
