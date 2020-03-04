package com.brijframework.useraccount.service.global;

import com.brijframework.useraccount.beans.rqrs.AddressDetailRequest;
import com.brijframework.useraccount.beans.rqrs.AddressDetailResponse;

public interface AddressDetailService {

	public AddressDetailResponse saveAddressDetail(AddressDetailRequest addressDetailRequest) ;

	public AddressDetailResponse getAddressDetail(long id);

	public boolean deleteAddressDetail(Long id);
}
