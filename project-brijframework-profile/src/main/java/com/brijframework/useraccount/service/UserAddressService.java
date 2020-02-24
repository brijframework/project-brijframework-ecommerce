package com.brijframework.useraccount.service;

import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;

public interface UserAddressService {

	UserAddressResponse saveAddress(UserAddressRequest userAddressRequest);

	UserAddressResponse getAddress(long id);

	boolean deleteAddress(Long id);

}
